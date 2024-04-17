package day07.encap;

public class Car {

    private String model; // 자동차 모델명
    private int speed; // 현재 속도 , 함수를 통해서 일정 범위 안에서 제한되어야 함 ( 세터메서드 )
    private char mode; // 변속 모드 ( P, N , D, R)
    private boolean start; // 시동이 걸린 여부

    // 생성자
    Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // 엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        if (start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        } else {
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("자동차가 폭발합니다.");
        }
    }

    // 엔진오일이 순환하는 기능
    private void moveEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    // 엔진 내부에 있는 실린더가 작동하는 기능
    private void moveCylinder() {
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }

    // 시동 버튼을 누르는 기능
    public void startStop() {
        this.start = !this.start;
        if (start) {
            System.out.println("시동이 켜졌습니다. 운행 준비를 시작합니다.");
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        } else {
            System.out.println("시동이 꺼졌습니다.");
        }
    }


    // 현재 속도를 제한하는 메서드
    // setter 메서드 : 필드값을 안전하게 설정하기 위한 검증 로직이 포함된 메서드
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) {
            this.speed = 0;
            this.start = false;
            this.mode = 'P';
            System.out.println("제한 속도 위반으로 시동이 안전하게 꺼졌습니다.");
        } else {
            this.speed = speed;
        }
    }

//    public void setMode(char mode) {
//        switch (mode) {
//            case 'P':
//                this.mode = 'P';
//                break;
//            case 'N':
//                this.mode = 'N';
//                break;
//            case 'D':
//                this.mode = 'D';
//                break;
//            case 'R':
//                this.mode = 'R';
//                break;
//            default:
//                System.out.println("올바르지 않은 변속 모드입니다.");
//
//        }
//
//    }
    public void setMode(char mode) {
        switch (mode) {
            case 'P': case 'N': case 'D': case 'R':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }


    // 현재 속도값을 가져오는 메서드
    // getter 메서드 : 정보은닉된 필드를 가져오는 대리 메서드
    public int getSpeed() {
        return speed;
    }

    public char getMode() {
        return mode;
    }

    // boolean 필드의 getter 는 이름관례가 다름 is + 필드명
    public boolean isStart() {
        return start;
    }
}


