package Proxy;

//proxy
public class ImageProxy implements Image{
    private String filename;
    private HighResImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    //displaying thumbnail without loading full page
    @Override
    public void display() {
        System.out.println("displaying thumbnail " + filename);
    }

    //loading and displaying full-res image only when required
    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResImage(filename);
        }
        realImage.displayFullImage();
    }
}
