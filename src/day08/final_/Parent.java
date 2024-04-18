    package day08.final_;

    class Child extends Parent {
        @Override
        void sing() {
            System.out.println("비비크림 빠빠빠");
        }

//        @Override
//        void dance() {
//            System.out.println("오예 땐스");
//        }
    }

    public class Parent {


         void sing() {
            System.out.println("랄랄라");
        }
         final void dance() {
            System.out.println("하하호호");
        }
}
