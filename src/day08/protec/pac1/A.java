package day08.protec.pac1;

public class A {

    protected int f1;
    int f2; // default


    protected void m1() {}
    void m2() {} // default


    public A() {}
    protected A(int a) {}
    A(double b) {}


    // 같은 클래스 내에선 접근 제한자 의미 X
    void test() {
        f1 = 1; f2 = 2;
        m1(); m2();
        new A();
        new A(1);
        new A(3.4);
    }


}
