package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/22/16.
 * For an array find product of all others in array, do not use division.
 * Iterate over the array maintaining a "left" and "right" product
 * at a new index, left = left*data[i] and right=right/data[i]
 *
 *
 */
public class P2 {


    public Integer[] allProducts(Integer[] data) {
        Integer[] left = new Integer[data.length] ;
        Integer[] right = new Integer[data.length] ;
        Integer[] out = new Integer[data.length] ;

        int lastLeft = 1 ;
        int lastRight = 1 ;
        for (int i=0; i<data.length ; i++) {
            left[i] = lastLeft;
            right[data.length - i - 1] = lastRight ;
            lastLeft = lastLeft * data[i] ;
            lastRight = lastRight * data[data.length - i - 1] ;
        }

        for (int i=0; i<data.length ; i++) {
            out[i] = left[i] * right[i] ;
        }

        return out ;
    }



}
