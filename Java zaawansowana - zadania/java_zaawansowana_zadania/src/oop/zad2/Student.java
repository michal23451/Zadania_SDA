package oop.zad2;

class Student extends Person {
    private String typStudiow;
    private int rokStudiow;
    private float kosztStudiow;

    public Student(String typStudiow, int rokStudiow, float kosztStudiow) {
        super();
        this.typStudiow = typStudiow;
        this.rokStudiow = rokStudiow;
        this.kosztStudiow = kosztStudiow;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public float getKosztStudiow() {
        return kosztStudiow;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void setKosztStudiow(float kosztStudiow) {
        this.kosztStudiow = kosztStudiow;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAddress() + " " + typStudiow + " " + rokStudiow + " " + kosztStudiow;
    }
}
