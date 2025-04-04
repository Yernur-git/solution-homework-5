package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory{
    private static final Map<String, Marker> markers = new HashMap<>();

    public static Marker getMarker(String type) {
        markers.putIfAbsent(type, new MarkerStyle());
        return markers.get(type);
    }
}
