package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/29/16.
 */
public class P40Test {
    @Test
    public void listDuplicates() throws Exception {

        P40 p40 = new P40() ;
        Integer[] data = new Integer[] {1,4,3,3,2}  ;
        Integer[] out = p40.listDuplicates(data) ;
        assertEquals(out[0], (Integer) 3);


    }

}