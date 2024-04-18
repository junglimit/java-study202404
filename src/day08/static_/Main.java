package day08.static_;

public class Main {
    public static void main(String[] args) {

        // static 은 객체 생성 없이 접근이 가능함 ( 클래스로 직접 접근 )
        Count.x = 20;

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        c1.y = 10;
        c2.y = 20;
        c1.m2();
        c2.m2();

        Count.x = 99; // static 이라서 변수값으로 접근이 의미가 없음(공유) / 그냥 클래스 이름으로 접근
        Count.x = 50;

        System.out.println("c1.x = " + Count.x);
        System.out.println("c2.x = " + Count.x);

        System.out.println("=================");

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

    }
}
