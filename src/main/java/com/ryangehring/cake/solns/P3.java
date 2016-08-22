package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/22/16.
 * Highest product of 3
 * Iterate over the array and find the positive 3 max eles and the negative 2 min eles
 *
 */

public class P3 {


    public Integer highestOfThree(Integer[] data) {
        Integer posMax1 =  0;
        Integer posMax2 =  0;
        Integer posMax3 =  0;
        Integer negMin1 = 0 ;
        Integer negMin2 = 0 ;

        for (Integer x : data) {
            if (x > posMax1) {
                posMax2 = posMax1 ;
                posMax3 = posMax2 ;
                posMax1 = x ;
            } else if (x > posMax2 ) {
                posMax3 = posMax2 ;
                posMax2 = x ;
            } else if (x > posMax3) {
                posMax3 = x ;
            } else if (x < negMin1) {
                negMin2 = negMin1 ;
                negMin1 = x ;
            } else if (x < negMin2) {
                negMin2 = x ;
            }
        }

        if (negMin1 * negMin2 > posMax2 * posMax3) {
            return negMin1 * negMin2 * posMax1 ;
        }

        return posMax1 * posMax2 * posMax3 ;
    }



}
