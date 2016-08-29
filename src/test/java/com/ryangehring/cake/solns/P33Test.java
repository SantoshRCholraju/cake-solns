package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/29/16.
 */
public class P33Test {
    @Test
    public void findTwiceInstance() throws Exception {

        Integer[] data = new Integer[] {1,2,3,5,5} ;
        P33 p33 = new P33() ;
        Integer out = p33.findTwiceInstance(data) ;
        assertEquals(out, (Integer) 5);

    }

}