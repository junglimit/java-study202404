package day07.player;

public class Player {

    String nickname;
    int level;
    int hp;


    public void showStatus() {
        System.out.println("\n====== Character's Info ==========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
