package day07.player;

public class Player {

    String nickname;
    int level;
    static int hp;

    Player(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        hp = 50;
    }



    public void showStatus() {
        System.out.println("\n====== Character's Info ==========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);

    }
}
