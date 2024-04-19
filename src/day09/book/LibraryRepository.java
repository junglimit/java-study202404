package day09.book;


// 역할: 도서관리 앱에서 사용하는 데이터들을 관리하는 객체
// 관리할 데이터: 1. 회원이 누구인지 2. 어떤 책을 가지고 있는지
public class LibraryRepository {

    private static BookUser user;
    private static BookList bookList;

    static {
//        user = new BookUser();
        bookList = new BookList();

        bookList.push(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
        bookList.push(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
        bookList.push(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
        bookList.push(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
        bookList.push(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
        bookList.push(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
    }


    // 저장소에 user를 저장
    public void saveBookUser(BookUser bookUser) {

        user = bookUser;
    }

    public static BookUser getUser() {
        return user;
    }

    // 책 정보가 들어있는 배열을 리턴
    public Book[] getAllBooksInfo() {
        return bookList.getbArr();
    }
}
