public class Bitmap extends ComputerGraphic{

    public Bitmap(int width, int height, String fileName){
        super(width, height, fileName);
    }

    @Override
    public void loadFile(){
        System.out.println("Loading bitmap file: " + fileName + " with dimensions " + width + "x" + height);
    }

    @Override
    public void saveFile(){
        System.out.println("Saving bitmap file: " + fileName);
    }




}
