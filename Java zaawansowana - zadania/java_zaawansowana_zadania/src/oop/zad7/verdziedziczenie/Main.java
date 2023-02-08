package oop.zad7.verdziedziczenie;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());

        ResizableCircle circle2 = new ResizableCircle(10);
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());
        circle2.resize(50);
        System.out.println(circle2.promien);
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());

    }
}
