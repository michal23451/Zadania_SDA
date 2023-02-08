package oop.zad7.verdziedziczenie;

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(int promien) {
        super(promien);
    }

    @Override
    public void resize(int procent) {
        this.promien = promien * procent / 100;
    }
}
