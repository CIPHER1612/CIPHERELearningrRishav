package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 11-02-2018.
 */

public class DataProviderMES3S3 {
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

        MoviesDetails.put("Measuring instruments ", Digital_and_Computer_Fundamentals);
        MoviesDetails.put("Transducers and strain gauges", Differential_Calculus);
        MoviesDetails.put("Measurement of force, torque, and pressure", Applications_of_Differentiation);
        MoviesDetails.put("Applied mechanical measurements", Integral_Calculus);
        MoviesDetails.put("Miscellaneous measurements", Definite_Integrals_and_its_Applicaitons);
        MoviesDetails.put("Limits, Fits, Tolerance & Testing of Geometric Dimensions", Differential_Equiations);
        return MoviesDetails;

    }
}