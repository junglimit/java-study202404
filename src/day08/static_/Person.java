package day08.static_;

public class Person {

    String name;
    int age;
    static String nation; // 국가 ( 한국인이라는 가정 )

    // 정적 초기화자 ( static initializer )
    // static 필드의 생성자 같은 역할 , 초기화 담당
    static {
        nation = "대한민국";
    }


    Person(String name, int age) {
        this.name = name;
        this.age = age;
//        this.nation = "대한민국";  // 스태틱필드 초기화 불가
    }
}
