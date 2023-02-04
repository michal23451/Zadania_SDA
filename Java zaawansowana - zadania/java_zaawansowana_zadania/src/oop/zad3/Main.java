package oop.zad3;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("red", true);
        System.out.println(shape1);

        Circle circle1 = new Circle("red", true, 10);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle("blue", false, 10,20);
        System.out.println(rectangle1);

        Square square1 = new Square("green", true, 50);
        square1.setLength(55);
        System.out.println(square1);
    }
}
