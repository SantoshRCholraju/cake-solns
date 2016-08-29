package com.ryangehring.cake.solns;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rgehring on 8/29/16.
 */
public class P32Test {
    @Test
    public void countingSort() throws Exception {

        P32 p32 = new P32() ;
        Integer[] data =  new Integer[]  { 1,6,3,3,8  }  ;
        Integer[] sorted = p32.countingSort(data, 10 ) ;
        assertEquals((Integer) sorted[1],(Integer) 3);

    }

}