package edu.brown.cs.student.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvReader {
    private ArrayList<Stars> StarList;


    // This reads the CSV and returns the values of the CSV in an ArrayList of
    //ArrayLists of Strings
    public ArrayList<Stars> readCSV(String filename) throws IOException {
        BufferedReader starBr = new BufferedReader(new FileReader(filename));
        String line;
        ArrayList<Stars> starsList = new ArrayList<Stars>();
        // scanner to validate file type
        Scanner in = new Scanner(filename);
        try {
            //want this to run if the first element is starID, second is
            // name, x, y, z
            if (in.nextLine().equals("StarID,ProperName,X,Y,Z")) {
                while ((line = starBr.readLine()) != null) {
                    // trims the white space for each line
                    line = line.trim();
                    // splits the line up, separating the values
                    String[] arguments = line.split(" ");
                    // turns each row into a Star object
                    int id = Integer.parseInt(arguments[0]);
                    String name = arguments[1];
                    int x = Integer.parseInt(arguments[2]);
                    int y = Integer.parseInt(arguments[3]);
                    int z = Integer.parseInt(arguments[4]);
                    Stars star = new Stars(id, name, x, y, z);

                    // add stars to starsList
                    starsList.add(star);

                    //closes scanner
                    in.close();
                    // closes the buffered reader
                    starBr.close();
                }
            }
        } catch(Exception e){
                // e.printStackTrace();
                System.out.println("ERROR: Enter correct filetype");
            }
            // returns the ArrayList containing the line list elements
            return starsList;
        }

    }



