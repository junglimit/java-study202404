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

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("=======================");

        CarShop shop = new CarShop();

        // 객체타입에서 다운캐스팅의 전제조건: 반드시 상속관계가 있어야 하며
        // 자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        // 올라갔던놈만 내릴 수 있음

        Sonata car = (Sonata)shop.exportCar(3000);
        car.accelerate(); // return 된 소나타는 Car 타입
        car.joinSonataClub();  // 소나타 기능 사용 불가 -> 강제 다운캐스팅 필요

        System.out.println("===========================");

//        Sonata ccc =(Sonata) new Car();  - 부모타입은 자식타입으로 강제로 못내림

//        Sonata mmm =(Sonata) new Mustang(); - 상속관계 아님

        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        System.out.println("==================");
        driver.drive(new Sonata());

        sonata1.accelerate();

        Tucson tucson = new Tucson();
        tucson.accelerate();
        tucson.brake();
    }
}
