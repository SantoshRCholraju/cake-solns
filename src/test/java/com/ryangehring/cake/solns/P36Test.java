package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/29/16.
 */
public class P36Test {
    @Test
    public void isRiffle() throws Exception {

        P36 p36 = new P36() ;
        Integer[] h1 = new Integer[] {1, 2, 3 , 4} ;
        Integer[] h2 = new Integer[] {5,6,7,8} ;
        Integer[] deck = new Integer[] {1,5,2,3,6,7,4,8} ;
        assertTrue(p36.isRiffle(h1, h2, deck));


    }

}