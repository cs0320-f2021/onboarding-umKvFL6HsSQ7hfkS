package edu.brown.cs.student.main;

import java.util.*;
import java.lang.Math;
import java.util.stream.Collectors;


public class NaiveNeighbors {
    private int k;
    private String name;
    private double x;
    private double y;
    private double z;

    public NaiveNeighbors(int k, String name, double x, double y, double z) {
        this.k = k;
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

//    public ArrayList<Integer> getWithCoord(double k, double x, double y, double z){
//        //ArrayList<> neighbId = new ArrayList<>(Arrays.asList(k, x, y, z));
//        //use distance formula somewhere
//        Stars neighbStarInfo = new Stars(id, name, x, y, z);
//        ArrayList<Integer> neighbId = new ArrayList<>();
//        return neighbId;
//    }


    public static List<Integer> kClosestNeighbors(StarList l, int k, Stars star) {
        List<Stars> list = l.getStarsList();
        Collections.shuffle(list);
        Collections.sort(list, new Comparator<Stars>() {
            @Override
            public int compare(Stars o1, Stars o2) {
                // if the first object is greater than the second you return a positive number
                double Star1dist = o1.getDist(star.getX(), star.getY(), star.getZ());
                double Star2dist = o2.getDist(star.getX(), star.getY(), star.getZ());
                if (Star1dist > Star2dist) {
                    return 1;
                } else if (Star1dist < Star2dist) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        // firstKElements is list of k closest stars
        List<Stars> firstKElementsList =
                list.stream().limit(k).collect(Collectors.toList());
        // idList is list of id's of those k closest stars
        List<Integer> idList =
                firstKElementsList.stream().map(Stars::getId).collect(Collectors.toList());
        return idList;
    }

    public static Stars findStar(String starName, StarList list) {
        //Iterate through the list
        List<Stars> l = list.getStarsList();
        Iterator<Stars> it = l.iterator();
        for (Stars star : l) {
            star.getName();
            // -- If star.name == starName return star (stream returns boolean)
            //if (l.stream().anyMatch(item -> starName.equals(Stars.getName()))){
            if (star.getName().equals(starName)) {
                return star;
            }

        }
    }


}



