package io.honghu.prototype;

public class Circle extends Shape {
 
   public Circle(){
     type = ShapeEnum.CIRCLE.getType();
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}