package com.ryangehring.cake.solns;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/23/16.
 */
public class P6Test {
    @Test
    public void areaOfOverlap() throws Exception {
        P6 p6 = new P6();
        ArrayList<Double> r1 = new ArrayList<Double>();
        ArrayList<Double> r2 = new ArrayList<Double>();

        r1.add(3d) ;
        r1.add(6d) ;
        r1.add(0d) ;
        r1.add(3d) ;

        r2.add(5d) ;
        r2.add(4d) ;
        r2.add(1d) ;
        r2.add(2d) ;

        assertEquals((double)p6.areaOfOverlap(r1, r2), 2d, 0.01d) ;

    }

}