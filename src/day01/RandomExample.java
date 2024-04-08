package day01;

public class RandomExample {
    public static void main(String[] args) {
        
        // 연산자 우선순위
        // 단항(++, --, !) > 이항(*, /, %...) > 삼항(?;) > 대입(=)
        
        int a = 10;
        int b = 10 * 3 - ++a;
        
        /*
            자바에서 난수 만들기

            자바 스크립트 = Math.floor(Math.random() * (y - x + 1)) + x
         */
        // 타입캐스팅 연산자 = 단항 연산자
        // Math.random => 0.0 <= ~ < 1.0
        // (int) Math.random => 0 <= ~ < 1
        int rn = (int) (Math.random() * 10) + 1;
        System.out.println("rn = " + rn);
    }
}
