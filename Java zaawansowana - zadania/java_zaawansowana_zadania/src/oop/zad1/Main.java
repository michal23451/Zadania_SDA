package oop.zad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);

        Point3D point3D = new Point3D(4,5,6);
        System.out.println(point3D);
        point3D.setXYZ(11,12,13);
        System.out.println(point3D);
        float[] xyz = point3D.getXYZ();
        System.out.println(Arrays.toString(xyz));
    }
}
