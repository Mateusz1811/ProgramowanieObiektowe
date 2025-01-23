public class Vector extends ComputerGraphic{
    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Loading vector file: " + fileName + " with dimensions " + width + "x" + height);
    }

    @Override
    public void saveFile() {
        System.out.println("Saving vector file: " + fileName);
    }
}
