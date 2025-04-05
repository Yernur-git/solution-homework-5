package Flyweight;

import java.util.HashMap;
import java.util.Map;

//flyweight factory
public class MarkerFactory{
    private static final Map<String, Marker> markers = new HashMap<>();

    //returning shared marker based on type
    public static Marker getMarker(String type) {
        //if not already created, create new marker
        markers.putIfAbsent(type, new MarkerStyle());
        return markers.get(type);
    }
}
