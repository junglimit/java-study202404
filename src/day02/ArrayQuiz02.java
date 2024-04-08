package day02;

import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("* 우리반 학생들의 별명: ");
        System.out.println("- 삭제할 학생의 별명을 입력하세요!");

        String[] arrList = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        while(true) {
            System.out.println("> ");
            String newNickname = scan.nextLine();
//            String target = newNickname;


            for (int i = newNickname; i < arrList.length ; i++) {
                arrList[i] = arrList[i + 1];

            }

            String[] temp = new String[arrList.length - 1];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = numbers[i];

            }
            numbers = temp;
            temp = null;


    }
}
