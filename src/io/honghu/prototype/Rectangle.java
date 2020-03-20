package io.honghu.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = ShapeEnum.RECTANGLE.getType();
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
