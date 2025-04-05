package Proxy;

//demo to show how proxy pattern works
public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("building.jpg");

        //for now, the full image isnt loaded yet
        image.display();

        //full image will be loaded and displayed now
        image.displayFullImage();
    }
}
