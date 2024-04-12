package day05;

// 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기위해 사용

//import day05.juice.Apple;
//import day05.juice.Banana;
//import day05.juice.Peach;

import day05.juice.*; // 전부 import 하기

import java.util.Scanner;

public class PackageMain {
    public static void main(String[] args) {

        day05.fruit.Apple a1 = new day05.fruit.Apple(); // fruit
        day05.juice.Apple a2 = new day05.juice.Apple(); // juice 이건 import 로 해결안됨 다쓰셈
        new Banana();
        new Peach();

        // 스캐너 원래 이렇게 불러야하는데 import 로 쉽게 작성가능
//        java.util.Scanner sc = new java.util.Scanner(System. in);
        Scanner sc = new Scanner(System. in);
    }
}
