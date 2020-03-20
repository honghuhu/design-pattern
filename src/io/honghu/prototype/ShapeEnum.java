package io.honghu.prototype;

public enum ShapeEnum {

    CIRCLE("circle"),
    SQUARE("square"),
    RECTANGLE("rectangle");

    private String type;

    ShapeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
