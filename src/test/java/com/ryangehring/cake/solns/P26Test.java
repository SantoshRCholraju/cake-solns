package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P26Test {
    @Test
    public void reverse() throws Exception {
        P26 p26 = new P26();
        String wordString = "reverse" ;
        char[] wordChar = wordString.toCharArray() ;
        p26.reverse(wordChar) ;
        wordString = new String(wordChar) ;
        assertEquals(wordString, "esrever");
    }

}