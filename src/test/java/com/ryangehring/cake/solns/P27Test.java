package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P27Test {
    @Test
    public void revWordsInPlace() throws Exception {
        P27 p27 = new P27() ;
        String sentence = "hello there my dude";
        assertEquals((String) "dude my there hello", (String) p27.revWordsInPlace(sentence));
    }

}