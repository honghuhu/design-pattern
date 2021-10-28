package io.honghu.prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape(ShapeEnum.CIRCLE.getType());
        clonedShape.setId(12);
        Shape clonedShape2 = (Shape) ShapeCache.getShape(ShapeEnum.CIRCLE.getType());
        clonedShape.setId(13);
        System.out.println(clonedShape.toString());
        System.out.println(clonedShape2.toString());
    }
}