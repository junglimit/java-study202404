package day09.book;

import day05.StringList;

import static util.SimpleInput.*;

// 역할: 도서관리 프로그램에서 입출력을 담당하는 객체
public class LibraryView {

    private LibraryRepository repository; // 전역변수로 만들기
    private CookBook cookBook;
    private CartoonBook cartoonBook;

    public LibraryView() {
        this.repository = new LibraryRepository();
    }

    public void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        // 입력된 데이터 저장
        repository.saveBookUser(new BookUser(name, age, gender, 0));

    }
    // 성별을 정확히 입력받을때까지 입력받고 리턴
    private  Gender inputGender() {
        while (true){
            String gender = input("# 성별(M/F): ").toUpperCase();
            if(gender.equals("M")) return Gender.MALE;
            if(gender.equals("F")) return Gender.FEMALE;
            System.out.println("\n 성별을 잘못 입력했습니다.");
        }
    }

    public void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }


//    public static String showProgramMenu() {
//        System.out.println("\n=========== 도서 메뉴 ===========");
//        System.out.println("# 1. 마이페이지");
//        System.out.println("* 2. 도서 전체 조회");
//        System.out.println("* 3. 도서 제목으로 검색");
//        System.out.println("* 4. 도서 대여하기");
//        System.out.println("* 5. 도서 저자이름으로 검색");
//        System.out.println("* 9. 프로그램 종료하기");
//
//        String menuNumber = input("- 메뉴 번호: ");
//        return menuNumber;
//    }

    public void showUserInfo () {

        System.out.println("******** 회원님 정보 *******");
        System.out.println("# 회원명: " + repository.getUser().getName()  );
        System.out.println("# 나이: " + repository.getUser().getAge());
        System.out.println("# 성별: " + repository.getUser().getGender());
        System.out.println("# 쿠폰개수: " + repository.getUser().getCouponCount());
    }

    public void start() {
        makeNewBookUser();
        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호: ");

            switch (menuNum) {
                case "1":
                    showUserInfo();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    findBookName();
                    break;
                case "4":
                    rentBook();
                    break;
                case "9":
                    System.out.println("프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    private void rentBook() {
        displayAllBooks();
        String bookNum = input("- 대여할 도서 번호 입력: ");
        //  대여 가능한지 여부 검증
        RentStatus status = repository.rentBook(Integer.parseInt(bookNum));

        if(status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("# 도서가 성공적으로 대여되었습니다.");
        } else {
            System.out.println("# 도서 대여에 실패했습니다.");
        }
    }

    // 책 제목으로 검색어가 포함된 책 내용 출력하기
    private void findBookName() {
//        String bookName = input("# 검색어: ");
//        Book[] informationList = repository.getAllBooksInfo();
//        for (Book book : informationList) {
//            book.getTitle();
//            if (bookName.contains(book.getTitle())) {
//                System.out.printf("\n=========== [%s] 검색 결과 ===========", bookName);
//                if(book instanceof CartoonBook) {
//                    System.out.printf("# 분류: 만화책, 제목: %s, 연령제한: %s",book.getTitle(), ((CartoonBook) book).getAccessAge());
//                }else if(book instanceof CookBook) {
//                    System.out.printf("# 분류: 요리책, 제목: %s, 쿠폰유무: %s",book.getTitle(), ((CookBook) book).isCoupon());
//                }
//
//            } else {
//                System.out.println("# 검색 결과가 없습니다.");
//                return;
//            }
//
//        }

        String keyword = input("# 검색어: ");

        Book[] searchBooks = repository.searchBookList(keyword);

        if (searchBooks.length > 0) {
            System.out.printf("\n======== [%s] 검색 결과 =========\n", keyword);
            for (Book searchBook : searchBooks) {
                System.out.println(searchBook.info());
            }
        } else {
            System.out.println("\n# 검색 결과가 없습니다.");
        }


    }


    // 전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n================== 전체 도서 목록 ===================");
        Book[] informationList = repository.getAllBooksInfo();
        for (int i = 0; i < informationList.length; i++) {
            Book book = informationList[i];
            System.out.printf("%d. %s\n", book.info());
        }
    }
}
