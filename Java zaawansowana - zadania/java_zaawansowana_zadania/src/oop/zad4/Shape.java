package oop.zad4;

abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + (isFilled ? "filled" : "not filled");
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
