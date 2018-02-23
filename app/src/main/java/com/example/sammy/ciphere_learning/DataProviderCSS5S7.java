package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 11-02-2018.
 */

public class DataProviderCSS5S7 {
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
        List<String> Applications_of_Differentiation = new ArrayList<String>();
        Applications_of_Differentiation.add("Notes");
        Applications_of_Differentiation.add("Textbook");
        Applications_of_Differentiation.add("Syllabus");
        Applications_of_Differentiation.add("Question Papers");
        Applications_of_Differentiation.add("Videos");

        List<String> Integral_Calculus = new ArrayList<String>();
        Integral_Calculus.add("Notes");
        Integral_Calculus.add("Textbook");
        Integral_Calculus.add("Syllabus");
        Integral_Calculus.add("Question Papers");
        Integral_Calculus.add("Videos");
        List<String> Definite_Integrals_and_its_Applicaitons = new ArrayList<String>();
        Definite_Integrals_and_its_Applicaitons.add("Notes");
        Definite_Integrals_and_its_Applicaitons.add("Textbook");
        Definite_Integrals_and_its_Applicaitons.add("Syllabus");
        Definite_Integrals_and_its_Applicaitons.add("Question Papers");
        Definite_Integrals_and_its_Applicaitons.add("Videos");

        MoviesDetails.put("Communication skills", Digital_and_Computer_Fundamentals);
        MoviesDetails.put("Information SEarch and Data Collection", Differential_Calculus);
        MoviesDetails.put("Guest Lectures", Digital_and_Computer_Fundamentals);
        MoviesDetails.put("Group Discussion", Differential_Calculus);
        MoviesDetails.put("Professional Presentation", Differential_Calculus);

        return MoviesDetails;

    }
}