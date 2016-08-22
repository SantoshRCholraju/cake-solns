package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/22/16.
 * Given an array of stock prices, calc the best trade possible assuming the stock is bought at index i and sold at j, j > i.
 * O(n) solution is desired.
 * Whe iterating over the array, you can note whether this is a new minimum or maximum.
 * If it's a minimum, set an index for new min to this value, and if a new max is subsequently discovered, update the new champ profit.
 * If it's a maximum, update the champ profit with the current minimum.
 */
public class P1 {



    public P1() {} ;


    public float bestTrade(Float[] prices ) throws IllegalArgumentException {

        if (prices.length < 2) {
            throw new IllegalArgumentException("price array too small") ;
        }

        Float curr_min = prices[0] ;
        Float best_profit = new Float(0) ;
        Integer curr_idx = 1 ;
        while (curr_idx < prices.length) {
            if (prices[curr_idx] - curr_min > best_profit) {
                best_profit = prices[curr_idx] - curr_min ;
            }
            if (prices[curr_idx] < curr_min) {
                curr_min = prices[curr_idx] ;
            }
            curr_idx += 1 ;
        }



        return best_profit ;
    }




}
