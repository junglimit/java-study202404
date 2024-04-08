package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하시려면 '그만'을 입력해 주세요");

            String[] foodList = {};
        while (true) {
            System.out.print(">> ");
            String newFood = scan.nextLine();

            if(newFood.equals("그만")) break;

            String[] temp = new String[foodList.length + 1];

            for (int i = 0; i < foodList.length ; i++) {
                temp[i] = foodList[i];

            }
            temp[temp.length-1] = newFood;
            foodList = temp;
            temp = null;
        }
        System.out.printf("먹고싶은 음식 리스트: " + Arrays.toString(foodList));




    }
}
