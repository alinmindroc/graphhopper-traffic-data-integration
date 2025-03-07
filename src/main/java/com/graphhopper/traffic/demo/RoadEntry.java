package com.graphhopper.traffic.demo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Peter Karich
 */
public class RoadEntry {

    private List<Point> points;
    private double value;
    private String valueType;
    private String mode;
    private String id;

    public RoadEntry() {
    }

    public RoadEntry(
            @JsonProperty("id") String id,
            @JsonProperty("points") List<Point> points,
            @JsonProperty("value") double value,
            @JsonProperty("value_type") String valueType,
            @JsonProperty("mode") String mode
    ) {
        this.points = points;
        this.value = value;
        this.valueType = valueType;
        this.mode = mode;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValueType(String type) {
        this.valueType = type;
    }

    /**
     * E.g. speed or any
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Currently 'replace', 'multiply' and 'add' are supported
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "points:" + points + ", value:" + value + ", type:" + valueType + ", mode:" + mode;
    }
}
