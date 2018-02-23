package com.example.sammy.ciphere_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sammy on 23-02-2018.
 */

public class DataProviderCSS2S5 {
    public static HashMap<String, List<String>> getInfo() {

        HashMap<String, List<String>> MoviesDetails = new HashMap<String, List<String>>();

        List<String> CARRER_PLANNING = new ArrayList<String>();
        CARRER_PLANNING.add("Notes");
        CARRER_PLANNING.add("Textbook");
        CARRER_PLANNING.add("Syllabus");
        CARRER_PLANNING.add("Question Papers");
        CARRER_PLANNING.add("Videos");
        List<String>JK= new ArrayList<String>();
        CARRER_PLANNING.add("Notes");
        CARRER_PLANNING.add("Textbook");
        CARRER_PLANNING.add("Syllabus");
        CARRER_PLANNING.add("Question Papers");
        CARRER_PLANNING.add("Videos");


        MoviesDetails.put("UNIT-1", CARRER_PLANNING);
        MoviesDetails.put("UNIT-2", JK);

        return MoviesDetails;

    }
}
