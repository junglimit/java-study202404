package day05;

public class ListMain {
    public static void main(String[] args) {

        StringList foods = new StringList();
        StringList userName = new StringList();

        // 배열 내부 데이터 수 확인
        System.out.println(foods.sArr.length); // foods 는 StringList 타입이라 랭스사용X

        System.out.println(foods.size()); // 메서드 하나 더 만들어서 편하게 출력

        // 배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");

        userName.push("박영희");

        foods.push("탕수육");

        // 자료 삭제
        foods.remove("짬뽕");

        // 자료 중간 삽입
        userName.push("김철수");
        userName.push("홍길동");

        userName.insert(1, "뽀로로");
        foods.insert(1, "마라탕");


        // 배열 데이터 수정
        foods.set(0, "김치볶음밥"); // 0번 인덱스 수정
        userName.set(1, "대길이");

        // 배열 데이터 전체삭제
//        foods.clear(); // foods 배열 내부가 전체삭제, size 0

        // 배열 데이터 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어있으면 true

        StringList hobbies = new StringList("축구", "영화감상", "음악감상");

        hobbies.push("멍때리기");

        System.out.println("hobbies = " + hobbies.toString());

        System.out.println(flag);
        System.out.println("foods = " + foods.toString());
        System.out.println("userName = " + userName.toString());
    }
}
