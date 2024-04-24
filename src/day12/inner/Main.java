package day12.inner;

public class Main {

    // 내부 클래스 ( 중첩 클래스 ) - static, private 사용 가능
    // 뺄셈 계산기를 만들때 만약 Main 안에서만 사용할경우

    public static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }

    public static void main(String[] args) {

        Calculator cal;
        cal = new AddCalculator();

        int r1 = cal.operate(10, 20);
        System.out.println("r1 = " + r1);

        cal = new SubCalculator();
        int r2 = cal.operate(10, 20);
        System.out.println("r2 = " + r2);

        // 익명 클래스: 이름이 없는 클래스를 빠르게 선언
        // 재활용을 하지 않는 일회용 클래스
        cal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        int r3 = cal.operate(10, 4);
        System.out.println("r3 = " + r3);


        // 익명함수를 만들때 만약 overriding 할 메서드가 1개라면 생략이 가능해짐 -> 람다
        // 전제조건
        // - 반드시 인터페이스 안의 추상메서드가 1개여야 한다.
        Calculator cal2 = (n1,n2) -> n1 / n2;

        int r4 = cal.operate(20, 5);
        System.out.println("r4 = " + r4);

        System.out.println("====================");

        Restaurant fr = new FrenchRestaurant();
        Restaurant fr2 = new FrenchRestaurant();
        Restaurant fr3 = new FrenchRestaurant();

        Restaurant japaneseRestaurant = new Restaurant() {

            @Override
            public void cook() {
                System.out.println("일식요리를 합니다");
            }

        };

        Restaurant italian = () -> System.out.println("이탈리아 요리를 합니다.");


    }


}
