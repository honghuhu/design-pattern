package io.honghu.prototype;

public class Square extends Shape {
 
   public Square(){
     type = ShapeEnum.SQUARE.getType();
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}