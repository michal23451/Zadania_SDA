package oop.zad5;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(-5, 2, 1, 6);
        System.out.println(line1);
        System.out.println("dlugosc = " + line1.dlugosc());
        System.out.println("wspolrzedne srodka = " + line1.wspolrzednesrodka());

        Line line2 = new Line(0, 0, 10, 0);
        System.out.println(line2);
        System.out.println("dlugosc = " + line2.dlugosc());
        System.out.println("wspolrzedne srodka = " + line2.wspolrzednesrodka());
    }

}
