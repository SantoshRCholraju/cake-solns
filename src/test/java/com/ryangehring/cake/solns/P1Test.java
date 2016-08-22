package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/22/16.
 */
public class P1Test {
    @Test
    public void bestTradeIsZeroNotNegative() throws Exception {
        Float[] prices = new Float[] {10f, 9f, 8f, 7f, 6f, 5f, 4f, 3f, 2f, 1f} ;
        P1 p1 = new P1() ;
        assertTrue(p1.bestTrade(prices) == 0f);

    }

    @Test
    public void bestTradeWorks() throws Exception {
        Float[] prices = new Float[] {10f, 12f, 8f, 11f, 6f, 5f, 4f, 3f, 2f, 1f} ;
        P1 p1 = new P1() ;
        assertTrue(p1.bestTrade(prices) == 3f);
    }

}