package com.ryangehring.cake.solns;

/**
 * kth to last node in ll
 * if you have a size property, call next (ll.size - k) -1 times from root.
 * if you do not, you can traverse the whdle list once to determine size.
 * then you can call next from root the right number of times.
 * if the list is doubly linked / has a tail element, call prev k times from tail.
 * other way - have a lagging pointer by k elements, update that as well.
 *
 */
public class P25 {
    public Integer kthToLastNode() {
        // This problem is boring :p
        return null ;
    }
}
