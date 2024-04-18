package day08.final_;

public class Student {

    String name;
    final String ssn; // 주민번호
    // 상수 선언: static + final = JS의 const
    static final String nation = "대한민국"; // 국적

//    public static final int // psfi
//    public static final String  // psfs

    Student(final String ssn){
//        ssn = "dsadd";  파라미터에도 final 을 걸어서 safety 한 코드를 만들 수 있다
        this.ssn = ssn;

        double pi = Math.PI;
    }
}
