package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // READING FROM A FILE

        ArrayList<String> shapes= new ArrayList<>();

        shapes.add("circle");
        shapes.add("rectangle");
        shapes.add("square");
        shapes.add("traingle");



        try {
            BufferedReader inputFile = 	new BufferedReader(
                    new FileReader("input.txt"));
            // inputFile.readLine();

            StringTokenizer line = new StringTokenizer(inputFile.readLine());

            line.nextToken(); // (to read token by token)
            while(line.hasMoreTokens()){
               // System.out.println("There are more tokens");
                if(line.equals("type")) {

                    long area;
                    if(line.nextElement().equals("circle") ){
                        StringTokenizer line2 = new StringTokenizer();
                        line2 = line.nextElement().to;
                        line2 = line2.nextElement();

                        area = 3.14 * ;
                    }
                    else if (line.nextElement().equals("rectangle")) {

                    } else if (line.nextElement().equals("square")) {

                    } else {

                    }
                }

                line.nextToken();
            }

            inputFile.close();

        } catch (FileNotFoundException e) {
            System.err.println(" exception : " + e.getMessage());
        }

        // WRITING TO A FILE

        try {
            PrintWriter outputFile =    new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("output.txt")));

            // outputFile.print();
            outputFile.println("This is a test");
            outputFile.println("For a file I have created");
            outputFile.println("on the past :)");

            // Closing the output stream enabling the reading of the file
            outputFile.close();

        } catch (IOException e) {
            System.err.println(" IOException occured: " + e.getMessage());
        }
    }
}
