package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/29/16.
 */
public class P41Test {
    @Test
    public void findDuplicate() throws Exception {
        P41 p41 = new P41() ;
        Integer[] data = new Integer[] {1,4,3,3,2}  ;
        Integer out = p41.findDuplicate(data) ;
        assertEquals(out, (Integer) 3);
    }

}