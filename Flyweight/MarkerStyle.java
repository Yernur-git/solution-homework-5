package Flyweight;

//concrete flyweight
public class MarkerStyle implements Marker{
    //intrinsic state
    private String type = "hospital";
    private String icon = "hospital.png";
    private String color = "red";

    //using extrinsic state to draw marker
    public void display(int x, int y) {
        System.out.println("displaying " + type + " marker at (" + x + "," + y + ")" + " with icon " + icon + " and color " + color);
    }
}
