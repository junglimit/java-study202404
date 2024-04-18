package day08.protec.pac1;

public class B {

    // 같은 패키지여도 의미 X
    void test () {

        A a = new A(); // public 생성자
        new A(10); // protected
        new A(3.3); // default

        a.f1 =10; a.f2= 30;
        a.m1(); a.m2();
    }
}
