package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < value.length(); i++){
            arr.add(value.substring(i));
        }
        arr.add("");
        return arr;
    }
}
