package Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("building.jpg");

        image.display();

        image.displayFullImage();
    }
}
