package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 23-02-2018.
 */

public class DataProviderCSS2S6 {
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


        MoviesDetails.put("Unit 1", CARRER_PLANNING);
        MoviesDetails.put("Unit 2", THE_GREAT_INDIAN_PSYCHOTHERAPY);

        return MoviesDetails;

    }
}
