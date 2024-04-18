package day08.super_;

public class Main {

    public static void main(String[] args) {

        // Child 를 만드는 순간 Heap 메모리에 자동으로 Parent 도 생성이 됨.
        // Child 안에는 자신의 필드,메서드,생성자와 함께 Parent 의 주소값이 저장이됨
        // 만약 Child 내부에(this) 필요한 속성이 없을 경우 외부(super,부모)에 가서 가져옴
        // Child 에 동일한 이름의 속성이 있을 경우엔 this 의 속성값을 사용함
        // 상속은 실제로 전부 물려받는게 아닌, 자신의 메모리에 부모의 주소값을 가지고 있는것
        Child c = new Child();
//        c.superMethod();
        c.childMethod();
    }

}
