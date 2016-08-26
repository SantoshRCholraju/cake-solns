package com.ryangehring.cake.solns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rgehring on 8/26/16.
 * Inflight Entertainment - find if 2 numbers sum to flight length in an array.
 * Iterate over array and store (flightlength - movie length) as a key. Then check if movieLength is a key before insert.
 */
public class P14 {

    public Boolean isTwoMovies(Integer flightLength , Integer[] movies) {
        Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for (Integer movieLength : movies) {
            if (sums.get(movieLength) != null) return true ;
            sums.put(flightLength - movieLength, 1) ;
        }
        return false;
    }

}
