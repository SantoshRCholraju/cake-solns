package com.ryangehring.cake.solns;

/**
 * Created by ryan on 8/28/16.
 */
public class P21 {
    public Integer findUnique(int[] data ) {
        int target = 0 ;
        for (int i : data) {
            target = target ^ i ;
        }
        return target ;

    }
}
