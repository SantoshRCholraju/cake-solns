package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/26/16.
 */
public class P13Test {
    @Test
    public void binSearch() throws Exception {
        P13 p13 = new P13();
        String[] data = {"zebra", "oak", "penguin"} ;
        Integer searchIdx = 0 ;
        assertEquals( searchIdx, p13.binSearch( data, 0, 2) );
    }
    @Test
    public void binSearch2() throws Exception {
        P13 p13 = new P13();
        String[] data = {"zebra", "zebra", "zebra", "zebra", "oak", "penguin"} ;
        Integer searchIdx = 3 ;
        assertEquals( searchIdx, p13.binSearch( data, 0, 5) );
    }
}