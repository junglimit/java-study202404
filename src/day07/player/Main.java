package day07.player;

// 상위 클래스 ( super class)
// : 공통 속성 (field)과 기능(method)을 가진 부모 클래스
public class Main {
    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("스티븐호킹");

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }


}
