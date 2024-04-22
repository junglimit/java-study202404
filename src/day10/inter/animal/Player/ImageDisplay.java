package day10.inter.animal.Player;

public class ImageDisplay extends MediaPlayer implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 일시정지 되었습니다");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 정지 되었습니다.");
    }
}
