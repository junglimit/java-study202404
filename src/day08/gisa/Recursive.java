package day08.gisa;

class Parent1{
    int compute(int num) {
        if(num <= 1) return num;
        return compute(num - 1) + compute(num - 2);
    }
}
class Child1 extends Parent1{
    int compute(int num) {
        if(num <= 1) return num;
        return compute(num - 1) + compute(num - 3);
    }
}
public class Recursive {
    public static void main(String[] args) {
        Child1 cc = new Child1();
        // Child 에서 호출했으니 아래것만 보면 됨
        System.out.println(cc.compute(4));
    }
}
