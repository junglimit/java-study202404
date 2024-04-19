package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();


        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};

        for (Car car : cArr) {
            car.accelerate();
        }

        // 다형성을 통해 다른 타입을 한 배열안에 넣을 수 있음
        // Object 사용은 지양하기 ( 너무 다 들어감 )
//        Object[] sArr = {"abc", "def", 100, false};
        System.out.println("=======================");

        Driver driver = new Driver();
        driver.drive(new Tucson());
    }
}
