package com.ryangehring.cake.solns;

/**
 * Given an array that's sorted, how quickly can you check if a nember is there?
 * Binary Search is log(n)
 * You could also cheat and trade space for time, making a hash using the array contents as keys giving o(1) access.
 */
public class P12 {
    public Integer binSearch(Integer target, Integer[] data, Integer left, Integer right) {
        // returns the index of the data or -1 for no match
        if (right - left == 1) {
            if (data[left] == target) return left;
            if (data[right] == target) return right;
        }
        if (right - left == 0) {
            if (data[left] == target) return left;
        }
        Integer midpt = (right + left) / 2 ;
        if (target == data[midpt]) return midpt ;
        if (target > data[midpt] ) return binSearch(target, data, midpt, right) ;
        if (target < data[midpt] ) return binSearch(target, data, left, midpt) ;

        return -1;
    }
}
