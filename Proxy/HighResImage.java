package Proxy;
//real subject
public class HighResImage implements Image{
    private String fileName;

    public HighResImage(String fileName) {
        this.fileName = fileName;
        load(); //simulation of loading image from disk or network
    }

    //simulation of loading a heavy image
    private void load() {
        System.out.println("loading high-resoultion image " + fileName);
    }

    //displaying a thumbnail image (low-res)
    public void display() {
        System.out.println("displaying thumbnail " + fileName);
    }

    //displaying full-res image
    @Override
    public void displayFullImage() {
        System.out.println("displaying full-resoultion image " + fileName);
    }
}
