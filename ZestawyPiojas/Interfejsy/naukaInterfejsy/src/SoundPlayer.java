public interface SoundPlayer {
    public abstract void playSound();
    default void stopSound(){
        System.out.println("Sound stopped");
    }

    static String getDeviceType(){
        return "Sound Device";
    }



}
