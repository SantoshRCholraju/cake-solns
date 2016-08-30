package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/30/16.
 */
public class P43 {

    public Integer[] mergeLists(Integer[] a, Integer[] b) {
        // should have gone recursive this is long :p
        Integer[] out = new Integer[a.length + b.length] ;
        int a_idx = 0;
        int b_idx = 0 ;

        while (a_idx < a.length && b_idx < b.length ) {
            if (a[a_idx] < b[b_idx]) {
                out[a_idx+b_idx]  = a[a_idx] ;
                a_idx++ ;
            } else if (a[a_idx] >= b[b_idx]) {
                out[a_idx+b_idx]  = b[b_idx] ;
                b_idx++ ;
            }
        }
        if (a_idx < a.length) {
            while (a_idx < a.length) {
                out[a_idx+b_idx]  = a[a_idx] ;
                a_idx++ ;
            }
        }
        if (b_idx < b.length) {
            while (b_idx < b.length) {
                out[a_idx+b_idx]  = b[b_idx] ;
                b_idx++ ;
            }
        }
        return out ;
    }
}
