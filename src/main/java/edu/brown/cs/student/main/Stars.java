package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Stars {
    private int id;
    private String name;
    private int x;
    private int y;
    private int z;

    public Stars (int id, String name, int x, int y, int z){
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getCoord(){
        ArrayList<Integer> coords = new ArrayList<>(Arrays.asList(x, y, z));
        return coords;
    }
}
