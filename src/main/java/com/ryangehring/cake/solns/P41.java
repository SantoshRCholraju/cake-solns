package com.ryangehring.cake.solns;

import java.util.HashSet;

/**
 * Created by rgehring on 8/29/16.
 * integers in a list are in range 1..n
 * there are n+1 elements in list
 * find any duplicate entries and optimize for space
 * naive solution - start on any index and check every other index. this is o(n2)
 * sorty solution - sort the array, then check if consecutive elements are equal. this is o(n log n )
 * sorting options --- insertion sort which is space efficient but O(n2) time (so equivalent to naive solution)
 * in place merge sort (or heap sort works)
 * actually because we have the max criteria here we can go ahead and move any integer to its corresponding
 * index. this is O(n) time and happens in place. oh well. i did a sorty way.
 *
 */
public class P41 {
    public Integer findDuplicate(Integer[] data) {

        int idx = 0 ;
        int val_at_next_idx = 0 ;
        int next_idx = 0 ;
        int store = 0 ;
        while (idx < data.length) {
            next_idx = data[idx] ;

            if (idx == next_idx ) {
                idx++ ;
                continue ;
            }

            // we know next_idx is pointing somewhere other than current place.
            // this value is the value there to be replaced by (next_idx)
            val_at_next_idx = data[next_idx] ;

            while ( val_at_next_idx != next_idx ) {
                data[next_idx] = next_idx ;
                next_idx =  val_at_next_idx;
                val_at_next_idx = data[next_idx] ;
            }
            return val_at_next_idx ;
        }
        return null ;
    }

}
