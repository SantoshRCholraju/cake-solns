package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryan on 8/28/16.
 */
public class P16Test {
    @Test
    public void maxValueCapacity() throws Exception {
        P16 p16 = new P16() ;
        P16.Cake[] cakes = {p16.new Cake(), p16.new Cake(), p16.new Cake()  };
        cakes[0].setValue(1);
        cakes[0].setWeight(1);
        cakes[1].setValue(3);
        cakes[1].setWeight(2);
        cakes[2].setValue(5);
        cakes[2].setWeight(3);
        Integer mv = p16.maxValueCapacity(1, cakes);
        assertEquals(mv, (Integer) 1);
    }


    @Test
    public void maxValueCapacity2() throws Exception {
        P16 p16 = new P16() ;
        P16.Cake[] cakes = {p16.new Cake(), p16.new Cake(), p16.new Cake()  };
        cakes[0].setValue(1);
        cakes[0].setWeight(1);
        cakes[1].setValue(3);
        cakes[1].setWeight(2);
        cakes[2].setValue(5);
        cakes[2].setWeight(3);
        Integer mv = p16.maxValueCapacity(7, cakes);
        assertEquals(mv, (Integer) 11);
    }


}