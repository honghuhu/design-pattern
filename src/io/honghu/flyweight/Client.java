package io.honghu.flyweight;

public class Client {

    private static final String COLORS[] = {"Red", "Green", "Blue"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

//    控制台结果
//    Creating circle of color : Red
//    Circle: Draw() [Color : Red, x : 10, y :11, radius :100
//    Circle: Draw() [Color : Red, x : 22, y :44, radius :100
//    Creating circle of color : Green
//    Circle: Draw() [Color : Green, x : 32, y :55, radius :100
//    Creating circle of color : Blue
//    Circle: Draw() [Color : Blue, x : 12, y :39, radius :100
//    Circle: Draw() [Color : Blue, x : 54, y :76, radius :100
//    Circle: Draw() [Color : Green, x : 26, y :14, radius :100
//    Circle: Draw() [Color : Red, x : 5, y :30, radius :100
//    Circle: Draw() [Color : Blue, x : 57, y :25, radius :100
//    Circle: Draw() [Color : Green, x : 0, y :20, radius :100
//    Circle: Draw() [Color : Blue, x : 17, y :3, radius :100
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

class FlyWeight {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);
        System.out.println(x.equals(y));
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x == w);
        System.out.println(y == w);
//        true
//        false
//        true
//        false
//        false
    }
}