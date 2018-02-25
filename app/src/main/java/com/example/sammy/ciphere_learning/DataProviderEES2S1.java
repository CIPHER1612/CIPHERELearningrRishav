package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 11-02-2018.
 */

public class DataProviderEES2S1 {
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

        List<String> Differential_Equiations = new ArrayList<String>();
        Differential_Equiations.add("Notes");
        Differential_Equiations.add("Textbook");
        Differential_Equiations.add("Syllabus");
        Differential_Equiations.add("Question Papers");
        Differential_Equiations.add("Videos");

        MoviesDetails.put("CAREER PLANNIN", Digital_and_Computer_Fundamentals);
        MoviesDetails.put(" THE GREAT INDIAN PSYCHOTHERAPY", Differential_Calculus);
        MoviesDetails.put(" GLOBAL WARMING", Applications_of_Differentiation);
        MoviesDetails.put("RENDEZVOUS WITH A WOMAN CORPORATE GIANT ", Integral_Calculus);
        MoviesDetails.put(" A UNIQUE PATIENT", Definite_Integrals_and_its_Applicaitons);
        MoviesDetails.put("A FARMER’S WIFE", Differential_Equiations);
        return MoviesDetails;

    }
}