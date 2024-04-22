package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

    // 정수를 입력받아 리턴하는 메서드
    public int inputNumber() throws InputMismatchException { // 라이브러리등을 사용할 경우에
        // 사용자의 의도대로 예외처리를 하기 위해 throws 로 표식을 남겨둠
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    // 문자열을 정수로 변환하는 메서드
    public int convert(String str) throws NumberFormatException {
        int n = Integer.parseInt(str);
        return n;
    }
}
