package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

        // 배열의 특징
        // 1. 동종 모음 구조 : 같은 타입의 데이터만 배열에 담을 수 있음
        // 2. 크기가 불변함 : 크기를 동적으로 늘이거나 줄일 수 없음

        // 배열의 생성 순서

        // 1. 배열 변수 선언
        int[] numbers; // 정수 타입(x) 정수 배열 타입(o)

        // 2. 배열의 객체를 생성
        // 변수는 Stack 에 저장이 되고, 배열 자체는 Heap 에 저장이 됨.
        // 이때 numbers 라는 변수는 pointer 가 됨( 주소값을 저장 )
        numbers = new int[5];
        System.out.println("numbers = " + numbers);

        // 3. 배열 값 초기화
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 66.7;
        numbers[3] = numbers[0] + 20;
        numbers[4] = 100;
//        numbers[5] = 10;

        // 배열의 길이
        System.out.println(numbers.length);

        // 배열의 순회
        System.out.println("=======================");

        for (int i = 0; i < numbers.length ; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);

        }

        System.out.println("=============================");
        
        // 배열 순회 forEach : iter
        for (int n : numbers) {
            System.out.println("n = " + n);
        }

        // 배열 내부 간결하게 출력
        System.out.println(Arrays.toString(numbers));


        // 배열 한번에 만들기
        int[] pointList = new int[] {10, 20, 30, 40};
        System.out.println(Arrays.toString(pointList));

        // 만약 배열변수 선언과 동시에 값을 초기화한다면
        // new Type[] 생략 가능
        String[] pets = {"멍멍이", "짹짹이", "콩수니"};
        pets = new String[] {"zzz", "fff"};

        // 배열을 생성만 하고 값을 넣지 않는다면
        // 각 타입의 기본값으로 미리 값을 넣어놓음
        // 기본값: 정수 0, 실수 0.0 , 논리 false, 문자 공백, 기타 null
        byte[] bArr = new byte[3];

        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5]; // 문자 아님, 기타임

        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(bArr.length);
    }

    static int[] getNumbers() {
        return new int[] {50, 30, 10};
    }
}