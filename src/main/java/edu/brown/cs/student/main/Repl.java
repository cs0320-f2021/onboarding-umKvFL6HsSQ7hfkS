package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Repl {

    public void RunRepl() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while ((input = br.readLine()) != null) {
                try {
                    input = input.trim();
                    String[] arguments = input.split(" ");
                    // TODO: complete your REPL by adding commands for Star command and
                    //  Neighbor commands
                    if (arguments[0].equals("Stars")) {
                        // parse through the csv by instatianting a CSVReader object
                        // have csvReader class return starlist it makes and store it in
                        // the global variable in main
                        CsvReader starsReader = new CsvReader();
                        // creates StarsList
                        StarList.setStarsList(starsReader.readCSV(arguments[1]));

                    } else if ((arguments[0].equals("naive_neighbors"))
                            && (arguments[2].contains("\""))) {
                        //create starsList
                        CsvReader starsReader = new CsvReader();
                        // creates StarsList
                        StarList list = StarList.setStarsList(starsReader.readCSV(arguments[1]));
                        //If second argument has quotes, find the star from the star list
                        // Implement find star function:
                        double k = Double.parseDouble(arguments[1]);
                        String name = arguments[1];
                        NaiveNeighbors neighbStar = new NaiveNeighbors(k, name,
                        double x, double y, double z);
                        // If the star.name == second argument, return the star
                        neighbStar.kClosestNeighbors(StarList, k, neighbStar.findStar(name, StarList));
                        // Find the k closest stars and return their ids
                        // -- Calculate the distances
                        // Use a comparator to sort a list by distance from input star
                        // return the first k ids associated with them


                        // make a new naive neighbors object
                        // use the starList to return the nearest neighbors list

                    }
                } catch (Exception e) {
                    // e.printStackTrace();
                    System.out.println("ERROR: Invalid input for REPL");
                }
            }

        }

    }

}

