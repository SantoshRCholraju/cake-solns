package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/30/16.
 */
public class P43Test {
    @Test
    public void mergeLists() throws Exception {

        P43 p43 = new P43() ;
        Integer[] a = new Integer[] {1,2,4,6,7} ;
        Integer[] b = new Integer[] {3,5,5,8,9} ;
        Integer[] out = p43.mergeLists(a,b) ;
        assertEquals(out[5], (Integer) 5);

    }
}