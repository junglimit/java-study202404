package day09.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}




public class Basic {

    void test() {

        // 다형성: 객체가 여러 타입을 사용할 수 있다.
        // - 부모의 타입을 사용 가능
        Object x1 = new A(); // 자식의 타입 (B,C) 를 사용할 수는 없음. / 가장 상위 부모인 Object 는 전부 사용 가능
        Object x2 = new B(); // super class 인 A의 타입을 사용 가능
        Object x3 = new C();
        Object x4 = new D(); // 부모인 B , B의 부모인 A, A의 부모인 Object 전부 타입으로 사용 가능
        Object x5 = new E();

        int a = 10;
        double b = a;// (doble) a; 가 자동으로 됨

        C c = new C();
        A d = c; // (A) c; 를 자동으로 해줌

    }

}
