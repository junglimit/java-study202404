package day09.poly.casting;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 100;
        child.p1 = 200;

        child.method1();
        child.method2();

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1();

        // 업캐스팅시엔 부모의 기능,필드만 사용이 가능해짐
        // 본인의 기능을 사용 못하게 됨
//        Parent castingChild = new Child();

//        castingChild.p1 = 100;
//        castingChild.c1 = 300;
//        castingChild.method1(); // Overriding 된 메서드가 실행됨
//        castingChild.method2();

        Child castingChild = new Child();

        castingChild.p1 = 100;
        castingChild.c1 = 300;
        castingChild.method1(); // Overriding 된 메서드가 실행됨
        castingChild.method2();

        Parent[] pArr = {castingChild}; // 자동으로 업캐스팅이 됨
        Parent pp = castingChild;
    }
}
