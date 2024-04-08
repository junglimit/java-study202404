package day01;

public class TypeCasting {
    public static void main(String[] args) {
        
        byte a = 100;
        int b = a;

        // 암묵적 형 변환
        System.out.println("b = " + b);
        
        int c = 1000;


        // 명시적 형 변환
        byte d = (byte) c;
        System.out.println("d = " + d);
        
        int k = 50;
        double j = k;
        System.out.println("j = " + j);
        
        double m = 5.567;
        int n = (int) m;
        System.out.println("n = " + n);

        // 암묵적 형변환 -> upcasting (promotion)
        // 명시적 형변환 -> downcasting
        // => 데이터 손실을 일으킬 수 있음

        int v = 100;
        double z = 5.5;

        // 타입이 다른 데이터의 연산은 작은 쪽은 큰쪽으로 캐스팅한다.
        double result = v * z;

        float f1 = 3.14F;
        double f2 = 5.5;
        double v1 = f1 - f2;
        
        int s = 10;
        double o = 5;
        int r2 = (int) (s * o); // 괄호 잘 체크해주기
        System.out.println("r2 = " + r2);

        
        // int이하의 사이즈를 다루는 타입은 연산시 결과가 자동으로 int로 캐스팅됨.
//        char b1 = 'A';
//        char b2 = 'C';
        
        byte b1 = 100;
        byte b2 = 50;

        System.out.println(b1 + b2);
        
        char cc = 'A';
        int plusNum = 3;
//        char r4 = cc + plusNum; // D라는 결과를 얻고 싶지만 int로 캐스팅이 되어버림
        char r4 = (char) (cc + plusNum); // option + enter
        System.out.println("r4 = " + r4);
        

        
    }
}
