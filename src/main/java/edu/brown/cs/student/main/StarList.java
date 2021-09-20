package edu.brown.cs.student.main;

import java.util.List;

public class StarList {
    private static List<Stars> starsList;

    // gets the starsList
    public static List<Stars> getStarsList(){
        return starsList;
    }

    // sets the starsList
    public static void setStarsList(List<Stars> newStarList){
        starsList = newStarList;
    }
}
