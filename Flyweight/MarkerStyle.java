package Flyweight;

public class MarkerStyle implements Marker{
    private String type = "hospital";
    private String icon = "hospital.png";
    private String color = "red";

    public void display(int x, int y) {
        System.out.println("displaying " + type + " marker at (" + x + "," + y + ")" + " with icon " + icon + " and color " + color);
    }
}
