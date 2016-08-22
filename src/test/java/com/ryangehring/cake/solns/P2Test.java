package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/22/16.
 */
public class P2Test {
    @Test
    public void allProducts() throws Exception {
        Integer[] prices = new Integer[] {1,2,4} ;
        Integer[] out = new Integer[] {8,4,2} ;
        P2 p2 = new P2() ;
        assertArrayEquals(p2.allProducts(prices) , out);
    }

}