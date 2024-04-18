package day08.final_;

public class Student {

    String name;
    final String ssn; // 주민번호
    String nation; // 국적

    Student(final String ssn){
//        ssn = "dsadd";  파라미터에도 final 을 걸어서 safety 한 코드를 만들 수 있다
        this.ssn = ssn;
    }
}
