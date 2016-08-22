package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/22/16.
 */
public class P3Test {
    @Test
    public void highestOfThreeNegative() throws Exception {
        P3 p3 = new P3() ;
        Integer[] prices = new Integer[] {1,-2, -4, 2, 7, -8} ;
        assertTrue(p3.highestOfThree(prices) == 224);
    }
    public void highestOfThreeZeros() throws Exception {
        P3 p3 = new P3() ;
        Integer[] prices = new Integer[] {1,0, 0, 0, 0, -8} ;
        assertTrue(p3.highestOfThree(prices) == 0);
    }
    public void highestOfThreePositive() throws Exception {
        P3 p3 = new P3() ;
        Integer[] prices = new Integer[] {1,-2, 4, 6} ;
        assertTrue(p3.highestOfThree(prices) == 24);
    }

}