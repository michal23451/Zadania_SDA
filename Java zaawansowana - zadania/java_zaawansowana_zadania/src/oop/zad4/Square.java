package oop.zad4;

class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setLength(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public String toString() {
        return String.format("Square with size=%f which is a subclass off %s", this.getWidth(), super.toString());
    }

}
