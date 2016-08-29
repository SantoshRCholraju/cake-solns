package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/29/16.
 */
public class P37 {

    public int rand5() {

        int total = 0 ;

        for (int i=0; i<5; i++){
            total = total + rand7();
        }

        return total / 5 ;

    }

    private int rand7() {
        return (int) (7 * Math.random()) + 1;
    }

}
