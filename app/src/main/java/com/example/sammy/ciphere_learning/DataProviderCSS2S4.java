package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 23-02-2018.
 */

public class DataProviderCSS2S4 {
    public static HashMap<String, List<String>> getInfo() {

        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> CARRER_PLANNING = new ArrayList<String>();
        CARRER_PLANNING.add("Notes");
        CARRER_PLANNING.add("Textbook");
        CARRER_PLANNING.add("Syllabus");
        CARRER_PLANNING.add("Question Papers");
        CARRER_PLANNING.add("Videos");
        List<String> THE_GREAT_INDIAN_PSYCHOTHERAPY = new ArrayList<String>();
        THE_GREAT_INDIAN_PSYCHOTHERAPY.add("Notes");
        THE_GREAT_INDIAN_PSYCHOTHERAPY.add("Textbook");
        THE_GREAT_INDIAN_PSYCHOTHERAPY.add("Syllabus");
        THE_GREAT_INDIAN_PSYCHOTHERAPY.add("Question Papers");
        THE_GREAT_INDIAN_PSYCHOTHERAPY.add("Videos");
        List<String> GLOBAL_WARMING = new ArrayList<String>();
        GLOBAL_WARMING.add("Notes");
        GLOBAL_WARMING.add("Textbook");
        GLOBAL_WARMING.add("Syllabus");
        GLOBAL_WARMING.add("Question Papers");
        GLOBAL_WARMING.add("Videos");

        List<String> RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT = new ArrayList<String>();
        RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT.add("Notes");
        RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT.add("Textbook");
        RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT.add("Syllabus");
        RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT.add("Question Papers");
        RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT.add("Videos");
        List<String> A_UNIQUE_PATIENT = new ArrayList<String>();
        A_UNIQUE_PATIENT.add("Notes");
        A_UNIQUE_PATIENT.add("Textbook");
        A_UNIQUE_PATIENT.add("Syllabus");
        A_UNIQUE_PATIENT.add("Question Papers");
        A_UNIQUE_PATIENT.add("Videos");
        List<String> A_FARMER_WIFE = new ArrayList<String>();
        A_FARMER_WIFE.add("Notes");
        A_FARMER_WIFE.add("Textbook");
        A_FARMER_WIFE.add("Syllabus");
        A_FARMER_WIFE.add("Question Papers");
        A_FARMER_WIFE.add("Videos");

        MoviesDetails.put("CAREER PLANNING", CARRER_PLANNING);
        MoviesDetails.put("THE_GREAT_INDIAN_PSYCHOTHERAPY", THE_GREAT_INDIAN_PSYCHOTHERAPY);
        MoviesDetails.put("GLOBAL WARMING ", GLOBAL_WARMING);
        MoviesDetails.put("RENDEZVOUS WITH A WOMAN CORPORATE GIANT", RENDEZVOUS_WITH_A_WOMAN_CORPORATE_GIANT);
        MoviesDetails.put("A UNIQUE PATIENT", A_UNIQUE_PATIENT);
        MoviesDetails.put("A FARMER'S WIFE", A_FARMER_WIFE);
        return MoviesDetails;

    }
}
