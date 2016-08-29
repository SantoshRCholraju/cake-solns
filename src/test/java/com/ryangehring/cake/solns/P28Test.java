package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/29/16.
 */
public class P28Test {
    @Test
    public void findParen() throws Exception {
        P28 p28 = new P28() ;
        String s = "i ( am ( cool? ) ) ";
        int idx = 7;
        int expected = 15 ;
        assertEquals(expected, (int) p28.findParen(s, idx));
    }

}