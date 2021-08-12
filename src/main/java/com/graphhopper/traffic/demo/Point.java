package com.graphhopper.traffic.demo;

import com.graphhopper.util.shapes.GHPoint;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Peter Karich
 */
public class Point {

    public final double lat;
    public final double lon;

    public Point(@JsonProperty("lat") double lat, @JsonProperty("lon") double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public GHPoint toGHPoint() {
        return new GHPoint(lat, lon);
    }

    @Override
    public String toString() {
        return lat + ", " + lon;
    }
}
