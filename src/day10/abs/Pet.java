

package day10.abs;

// 추상 클래스
// 기존 클래스의 기능은 전부 사용 가능함.
// 생성자도 만들 수 있음 ( 다른 클래스에서 super 호출 가능 )
public abstract class Pet {

    String name;
    int age;
    String kind;

    // 필요한 기능은 필요한 객체가 필요에 따라 overriding 하면 됨.
    public final void walk() {
        System.out.println("산책은 무조건 공원에서만 하세요");
    }

    // 추상 메서드 : 필수기능이 없으면 객체가 불안정해지므로 강요할 필요가 있음.
    // 상속하면 어차피 overriding 하니까 그냥 껍데기만 제공하는것.
    // abstract 는 본문 블럭을 가질 수 없음.
    public abstract void eat();
    public abstract void sleep();
}
