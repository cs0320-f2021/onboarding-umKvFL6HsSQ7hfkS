package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Stars {
    private int id;
    private static String name;
    private double x;
    private double y;
    private double z;

    public Stars(int id, String name, double x, double y, double z) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public double getDist(double x2, double y2, double z2) {
        Double distance = Math.sqrt((Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)
                + Math.pow(z2 - z, 2)));
        return distance;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}

//    public ArrayList<Integer> getCoord(){
//        ArrayList<Integer> coords = new ArrayList<Integer>(Arrays.asList(x, y, z));
//        return coords;
//    }

