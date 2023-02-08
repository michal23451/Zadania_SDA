package oop.zad7.verkompozyja;

class ResizableCircle implements Resizable{
    private Circle circle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public ResizableCircle(int promien) {
        this.circle = new Circle(promien);
    }

    @Override
    public void resize(int procent) {
        circle.setPromien(circle.getPromien() * (procent/100.0));
    }
}
