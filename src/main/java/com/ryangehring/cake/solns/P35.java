package com.ryangehring.cake.solns;

import java.util.HashMap;

/**
 * In place shuffle of a list
 * For each element generate a random number
 * Sort array by the random number
 * Order nlogn
 */
public class P35 {
    public String[] shuffle(String[] data ) {

        String temp ;
        for (int i=0; i< data.length ; i++) {
            int dest = (int) Math.floor((Math.random() * data.length));
            temp = data[i] ;
            data[i] = data[dest] ;
            data[dest] = temp ;
        }

        return data ;
    }
}
