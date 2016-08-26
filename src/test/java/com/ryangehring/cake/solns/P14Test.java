package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/26/16.
 */
public class P14Test {
    @Test
    public void isTwoMovies() throws Exception {
        P14 p14 = new P14();
        assertTrue(p14.isTwoMovies( 14, new Integer[] {7,7}   ));
    }
    @Test
    public void isTwoMovies2() throws Exception {
        P14 p14 = new P14();
        assertTrue(!p14.isTwoMovies( 14, new Integer[] {7}   ));
    }
    @Test
    public void isTwoMovies3() throws Exception {
        P14 p14 = new P14();
        assertTrue(p14.isTwoMovies( 13, new Integer[] {7,1,3,8,0,6}   ));
    }

}