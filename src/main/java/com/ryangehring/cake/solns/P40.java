package com.ryangehring.cake.solns;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by rgehring on 8/29/16.
 * integers in a list are in range 1..n
 * there are n+1 elements in list
 * find any duplicate entries and optimize for space
 * naive solution - start on any index and check every other index. this is o(n2)
 * sorty solution - sort the array, then check if consecutive elements are equal. this is o(n log n )
 * sorting options --- insertion sort which is space efficient but O(n2) time (so equivalent to naive solution)
 * in place merge sort (or heap sort works)
 * actually because we have the max criteria here we can go ahead and move any integer to its corresponding
 * index. this is O(n) time and happens in place. oh well. i did a sorty way.
 *
 */
public class P40 {
    public Integer[] listDuplicates(Integer[] data) {

        inPlaceSort(data, (int)0, (int) data.length -1);

        Integer head ;
        HashSet<Integer> out = new HashSet<Integer>() ;

        Integer tail = data[0];
        for (int i=1; i < data.length; i++) {
            head = data[i] ;
            if (head == tail) out.add(head) ;
            tail = head ;
        }
        Integer[] outArray = new Integer[out.size()]   ;
        int i=0 ;
        for (Integer val : out) {
            outArray[i] = val;
            i++ ;
        }
        return outArray ;
    }

    private void inPlaceSort ( Integer[] x, int first, int last ) {
        if (first >= last) return ;
        int mid=(first+last)/2 ;
        inPlaceSort (x, first,  mid);
        inPlaceSort (x, mid+1, last);

        int left = first;
        int right = mid+1;

        if ( x[mid].compareTo(x[right]) <= 0 )
            return;

        while (left <= mid && right <= last)
        {
            if ( x[left].compareTo(x[right]) <= 0 )
                left++;

            else
            {  Integer tmp = x[right];
                System.arraycopy(x, left, x, left+1, right-left);
                x[left] = tmp;
                left++;  mid++;  right++;
            }
        }
    }
}
