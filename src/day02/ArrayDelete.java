package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열에서 원하는 위치의 값 삭제하기
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 2;



        // 지울 인덱스값으로 하나씩 번호를 땡겨온뒤에 맨끝자리 pop
//        numbers[2] = numbers[3];
//        numbers[3] = numbers[4];
//        numbers[4] = numbers[5];

        // for 문으로 해결
        for (int i = targetIndex; i < numbers.length ; i++) {
            numbers[i] = numbers[i + 1];

        }

        int[] temp = new int[numbers.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];

        }
        numbers = temp;
        temp = null;


        System.out.println(Arrays.toString(numbers));
    }
}
