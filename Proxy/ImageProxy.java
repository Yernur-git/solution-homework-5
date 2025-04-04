package Proxy;

public class ImageProxy implements Image{
    private String filename;
    private HighResImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("displaying thumbnail " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResImage(filename);
        }
        realImage.displayFullImage();
    }
}
