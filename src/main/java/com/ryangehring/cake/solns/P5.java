package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/23/16.
 */
public class P5 {
    public void printWaysToMakeChange(Integer val, String prefix, Boolean quarters, Boolean dimes, Boolean nickels ) {
        // not dynamic
        if (val == 0) {
            System.out.println(prefix);
            return;
        }
        if (val < 0) {
            return;
        }

        //
        if (quarters) {
            printWaysToMakeChange( val - 25, prefix+'Q', true, true, true);
            printWaysToMakeChange( val - 25, prefix+'Q', false, true, true);
            printWaysToMakeChange( val - 25, prefix+'Q', false, false, true);
            printWaysToMakeChange( val - 25, prefix+'Q', false, false, false);
        } if (dimes) {
            printWaysToMakeChange( val - 10, prefix+'D', false, true, true);
            printWaysToMakeChange( val - 10, prefix+'D', false, false, true);
            printWaysToMakeChange( val - 10, prefix+'D', false, false, false);

        } if (nickels) {
            printWaysToMakeChange( val - 5, prefix+'N', false, false, true);
            printWaysToMakeChange( val - 5, prefix+'N', false, false, false);

        }
        printWaysToMakeChange( val - 1, prefix+'P', false, false, false);



    }

}
