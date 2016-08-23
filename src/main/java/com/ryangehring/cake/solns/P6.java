package com.ryangehring.cake.solns;

import java.util.List;

/**
 * Created by rgehring on 8/23/16.
 */
public class P6 {


    public Double areaOfOverlap(List<Double> r1, List<Double> r2) {
        // assumes rectangles are stored as top, right, bottom, left coords
        // find vertical overlap
        // find horizontal overlap
        // multiply
        Double minTop = Math.min(r1.get(0), r2.get(0));
        Double maxBottom = Math.max(r1.get(2), r2.get(2) );
        Double maxLeft = Math.max(r1.get(3), r2.get(3)) ;
        Double minRight = Math.min(r1.get(1), r2.get(1));
        if (minTop - maxBottom <= 0) {return 0d;}
        if (minRight - maxLeft <= 0) {return 0d;}
        return (minTop - maxBottom)*(minRight - maxLeft) ;

    }

}
