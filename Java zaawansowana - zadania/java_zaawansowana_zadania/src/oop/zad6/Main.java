package oop.zad6;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint1);
        movablePoint1.moveRight();
        System.out.println(movablePoint1);
        Movable movable1 = new MovablePoint(0,0,1,1);
        System.out.println(movable1);
        movable1.moveDown();
        movable1.moveDown();
        System.out.println(movable1);

        Movable movable2 = new MovableCircle(0,0,2,2,5);
        System.out.println(movable2);
        movable2.moveRight();
        movable2.moveRight();
        System.out.println(movable2);
    }
}
