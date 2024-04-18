package day08.static_;

public class Count {

    // 사용 제한자 (usage modifier)
    static int x; // 정적 필드 : 모든 객체가 공유
    int y; // 인스턴스 필드 : 각 객체별로 따로 관리


    // 정적 메서드 : 모든 객체가 공유, 객체 생성 없이 접근 가능
    static void m1() {
        System.out.println("static method call!!");
        System.out.println("x (static) = " + x);
        // y의 주체를 알 수 없음. 인스턴스필드를 직접 참조가 불가능함 ( 객체 생성 X, this X )
//        System.out.println("y (instance) = " + y);

//        Count c3 = new Count();
//        System.out.println("y (instance) = " + c3.y);
    }

    // 인스턴스 메서드 : 각 객체별로 따로 실행됨 , this 의 주체가 바뀌기 때문에 this 를 사용가능
    void m2() {
        System.out.println("instance method call!!");
        System.out.println("x (static) = " + x);
        System.out.println("y (instance) = " + y);
        m1();
    }
}
