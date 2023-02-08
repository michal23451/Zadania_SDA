package oop.zad7.verdziedziczenie;

class Circle implements GeometricObject {
    protected double promien;

    public Circle(int promien) {
        this.promien = promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(promien,2);
    }
}
