package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 11-02-2018.
 */

public class DataProviderCES6S5 {
    public static HashMap<String, List<String>> getInfo() {

        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> Digital_and_Computer_Fundamentals = new ArrayList<String>();
        Digital_and_Computer_Fundamentals.add("Notes");
        Digital_and_Computer_Fundamentals.add("Textbook");
        Digital_and_Computer_Fundamentals.add("Syllabus");
        Digital_and_Computer_Fundamentals.add("Question Papers");
        Digital_and_Computer_Fundamentals.add("Videos");
        List<String> Differential_Calculus = new ArrayList<String>();
        Differential_Calculus.add("Notes");
        Differential_Calculus.add("Textbook");
        Differential_Calculus.add("Syllabus");
        Differential_Calculus.add("Question Papers");
        Differential_Calculus.add("Videos");


        MoviesDetails.put("UNIT 1", Digital_and_Computer_Fundamentals);
        MoviesDetails.put("UNIT 2", Differential_Calculus);

        return MoviesDetails;

    }
}