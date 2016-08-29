package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/29/16.
 * Naive solution, start at floor 0 and try each floor.
 * Since you have two eggs you can cut in half as many times as possible by dropping egg at 50% mark.
 * When egg breaks you can iterate from bottom up.
 * However, this strategy probably isn't optimal. There's likely a value below half to drop the egg which is optimal,
 * because the expected value of future searching is worth more than the incremental floors gained.
 * So what is the magic ratio here?
 * Regret minimization algorithm here. if we take step size n and are wrong, there will be:
 *  n-1 iterations to the next step.
 *  if we are right, we then want to be take (n-1) in the next direction.
 * What is our regret for a choice of search step size k?
 * k + k-1 + k-2 + k-3 +... >= floor size
 */
public class P39 {

    public Integer findHighest(int floorSize, int answer) {
        // (k2 + k) / 2 - floorsize = 0
        // -1/2 +- sqrt (1/4 - 2floorsize) = x
        double root = -.5 + Math.sqrt(.25 + 2*floorSize) ;
        int step = (int) Math.ceil(root) ;
        int curr_floor = 0 ;
        while (step > 0) {
            curr_floor = curr_floor  + step ;
            if (curr_floor > answer) {
                curr_floor = curr_floor - step ;
                for (int j = 1; j < step; j++) {
                    if ((j+curr_floor)==answer) return j+curr_floor  ;
                }
                return -1;
            }
            step = step -1 ;
        }
        return floorSize ;

    }

}
