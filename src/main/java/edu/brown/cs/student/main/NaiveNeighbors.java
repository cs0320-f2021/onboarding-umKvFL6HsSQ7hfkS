package edu.brown.cs.student.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NaiveNeighbors {
    private int k;
    private String name;
    private int x;
    private int y;
    private int z;

    public NaiveNeighbors (int k, String name, int x, int y, int z){
        this.k = k;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public ArrayList getWithCoord(int k, int x, int y, int z){
        ArrayList<> neighId = new ArrayList<>(Arrays.asList(k, x, y, z));
        return neighId;
    }

    public HashMap<String, Integer> getWithName(String name, int k){
        HashMap<String, Integer> mapOfNeighbInfo = new HashMap<String, Integer>();
        if(k > 0){
            mapOfNeighbInfo.put(name, k);
            return mapOfNeighbInfo;
        }
    }
}

/*     try {
           if (k > 0){
               ArrayList<Integer> neighborInfo =
                       new ArrayList<>(Arrays.asList(k, x, y, z));
               return neighborInfo;

           }

        } catch (Exception e) {
                e.printStackTrace();
                System.out.println("ERROR: Invalid input for REPL");
        }

 */