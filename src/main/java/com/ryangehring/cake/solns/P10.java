package com.ryangehring.cake.solns;

/**
 * Find 2nd biggest item in binary search tree
 */
public class P10 {

    public Integer findSecondLargestInBST(P9.Tree t) {

        // order log(n) or the height of the tree
        Integer currVal = null ;
        Integer lastVal = null ;
        while (t != null) {
            if (currVal != null) {
                lastVal = currVal;
            }
            currVal = t.getPayload() ;
            t = t.getRight();
        }
        return lastVal ;
    }

}
