package day11.api.lang;

public class Wrapper {

    // 같은 int 지만, 래퍼타입은 클래스이기 때문에, 기본값이 기본 int 와 다름
    private int number1; // 기본값: 0
    private Integer number2; // 기본값: null

    public static void main(String[] args) {


        // Wrapper type ( 기본(원시)타입을 객체로 포장함 )
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character
        Integer a = new Integer(10);
    }
}
