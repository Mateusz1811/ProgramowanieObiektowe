public class SoundTester {
    public static void main(String[] args){
        MusicPlayer musicPlayer = new MusicPlayer();
        Radio radio = new Radio();

        musicPlayer.playSound();
        musicPlayer.stopSound();
        radio.playSound();
        radio.stopSound();
        System.out.println(SoundPlayer.getDeviceType());



    }
}
