package day09.poly.car;

import day04.Dog;

public class Driver {

        String carName = "";
    public void drive(Car car) {

        if(car instanceof Sonata){
            carName = "쏘나타";
        }else if(car instanceof Tucson){
            carName = "투싼";
        }else if(car instanceof Mustang){
            carName = "머스탱";
        }
        System.out.println("운전을 시작합니다");
        car.accelerate();
    }
}
