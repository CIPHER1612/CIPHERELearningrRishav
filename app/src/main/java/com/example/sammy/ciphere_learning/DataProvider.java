package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 11-02-2018.
 */

public class DataProvider {
    public static HashMap<String, List<String>> getInfo() {

        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> Coordinate_Geometry = new ArrayList<String>();
        Coordinate_Geometry.add("Notes");
        Coordinate_Geometry.add("Textbook");
        Coordinate_Geometry.add("Syllabus");
        Coordinate_Geometry.add("Question Papers");
        Coordinate_Geometry.add("Videos");
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

        MoviesDetails.put("Co-ordinate Geometry", Coordinate_Geometry);
        MoviesDetails.put("Differenatial Calculus", Differential_Calculus);
        MoviesDetails.put("Applications of Differentiation", Applications_of_Differentiation);
        MoviesDetails.put("Integral Calculus", Integral_Calculus);
        MoviesDetails.put("Definits Integrals and it's Applications", Definite_Integrals_and_its_Applicaitons);
        MoviesDetails.put("Differential Equiations", Differential_Equiations);
        return MoviesDetails;

    }
}