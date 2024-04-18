package day08.super_;

public class Parent {

    // 필드: 객체의 속성
    int a;
    double b;

    // 생성자: 리턴타입없음, 클래스이름
    Parent() {
        // 오브젝트 기본 생성자 생략 되어있음
        // super();
        System.out.println("Parent 클래스 생성자 호출!");
        this.a = 15;
        this.b = 20.5;
    }

    // 메서드: 객체의 기능
    void superMethod() {
        System.out.println("Parent a = " + a);
        System.out.println("Parent b = " + b);
    }
}
