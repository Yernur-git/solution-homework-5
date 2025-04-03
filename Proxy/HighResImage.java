package Proxy;

public class HighResImage implements Image{
    private String fileName;

    public HighResImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("loading high-resoultion image " + fileName);
    }

    public void display() {
        System.out.println("displaying thumbnail " + fileName);
    }

    @Override
    public void displayFullImage() {
        System.out.println("displaying full-resoultion image " + fileName);
    }
}
