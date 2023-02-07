package oop.zad6;

class MovableCircle implements Movable {
    MovablePoint movablePoint;
    int promien;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int promien) {
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        this.promien = promien;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", promien=" + promien +
                '}';
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }
}
