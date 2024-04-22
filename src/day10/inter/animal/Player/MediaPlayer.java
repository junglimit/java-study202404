package day10.inter.animal.Player;

class MediaPlayer {
    private MediaPlayable[] mediaList = new MediaPlayable[0];

    public void addMedia(MediaPlayable media) {
        // 주어진 media 를 mediaList 배열에 추가
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[temp.length - 1] = media;
        mediaList = temp;
    }

    public void playAll() {
        // 반복문을 통해 mediaList 에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }

    public void stopAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.stop();
        }
    }
    public void pauseAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.pause();
        }
    }
}

