package Flyweight;

//demo to show how flyweight pattern works
public class FlyweightDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //reusing markers from factory
            Marker marker = MarkerFactory.getMarker("hospital");
            marker.display(randomX(), randomY());
        }
    }

    //random coordinates to simulate different marker placements
    private static int randomX() {
        return (int) (Math.random() * 100);
    }

    private static int randomY() {
        return (int) (Math.random() * 100);
    }
}
