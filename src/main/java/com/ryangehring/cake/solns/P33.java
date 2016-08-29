package com.ryangehring.cake.solns;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by rgehring on 8/29/16.
 * go through an array and find the number that appears twice
 * naive solution - read through array sequentially and hash counts for each number
 * Can't think of a bit manipulation solution (xor trick fails)
 * Could also sacrifice runtime for space by sorting the array
 *
 */
public class P33 {

    public Integer findTwiceInstance(Integer[] data) {

        HashSet set = new HashSet() ;
        for (Integer x : data) {
            if (set.contains(x) ) return x ;
            set.add(x) ;
        }
        return -1 ;

    }

}
