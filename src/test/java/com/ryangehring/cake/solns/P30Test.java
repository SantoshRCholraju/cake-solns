package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/29/16.
 */
public class P30Test {
    @Test
    public void isEvenPal() throws Exception {

        P30 p30 = new P30() ;
        assertTrue(p30.isEvenPal("duduohoh")) ;
    }

}