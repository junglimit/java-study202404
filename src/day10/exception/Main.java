package day10.exception;

public class Main {

    public static void main(String[] args) {
        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

        try {
            int n = te.convert("550@");
            System.out.println("n = " + n);
        } catch (NumberFormatException e) {
            System.out.println("냐냐냔냐냐냐냐ㅑㄴ");
        }

        LoginUser user = new LoginUser("abc1234", "1234");

        try {
            user.loginValidate("abc1234", "1234");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
