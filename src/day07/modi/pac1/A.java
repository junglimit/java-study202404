package day07.modi.pac1;

public class A {

    // 필드
    public int f1;
    int f2;  // default
    private int f3;

    // 메서드
    public void m1() {}
    void m2() {}  // default
    private void m3() {}


    // 생성자
    public A(int a){}
    A(double b){}
    private A(boolean c){}

    // 같은 클래스 내부에선 어떤 접근자가 붙어도 사용 가능함
    void  test(){
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        new A(10);
        new A(5.5);
        new A(false);
    }
}
