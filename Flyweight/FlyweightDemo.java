package Flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Marker marker = MarkerFactory.getMarker("hospital");
            marker.display(randomX(), randomY());
        }
    }

    private static int randomX() {
        return (int) (Math.random() * 100);
    }

    private static int randomY() {
        return (int) (Math.random() * 100);
    }
}
