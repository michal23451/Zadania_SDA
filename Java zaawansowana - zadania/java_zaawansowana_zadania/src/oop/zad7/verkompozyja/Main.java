package oop.zad7.verkompozyja;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());

        ResizableCircle circle2 = new ResizableCircle(10);
        System.out.println(circle2.getCircle().getPerimeter());
        System.out.println(circle2.getCircle().getArea());
        circle2.resize(50);
        System.out.println(circle2.getCircle().getPromien());
        System.out.println(circle2.getCircle().getPerimeter());
        System.out.println(circle2.getCircle().getArea());

    }
}
