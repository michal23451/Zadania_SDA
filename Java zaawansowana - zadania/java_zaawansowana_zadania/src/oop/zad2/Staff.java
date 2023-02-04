package oop.zad2;

class Staff extends Person {
    private String specjalizacja;
    private float wynagrodzenie;

    public Staff(String specjalizacja, float wynagrodzenie) {
        super();
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public float getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public void setWynagrodzenie(float wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAddress() + " " + specjalizacja + " " + wynagrodzenie;
    }
}
