package com.ryangehring.cake.solns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryan on 8/28/16.
 */
public class P16 {

    public class Cake {
        public Cake() {}
        private Integer value;

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        private Integer weight ;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    public Integer maxValueCapacity(Integer capacity, Cake[] cakes ) {
        Map<Integer, Integer> pastSolns = new HashMap<Integer, Integer>() ;
        return maxValueAtCapacity(capacity, cakes, pastSolns);
    }

    private Integer maxValueAtCapacity(Integer capacity,Cake[] cakes, Map<Integer, Integer> pastSolns  ) {
        if (pastSolns.get(capacity) != null) return pastSolns.get(capacity);
        if (capacity < 1) return 0 ;

        Integer maxValue = 0 ;
        Integer valueToConsider = 0;
        for (Cake cake  : cakes) {
            if (cake.getWeight() > capacity) continue;
            valueToConsider = cake.getValue() + maxValueAtCapacity(capacity - cake.getWeight(), cakes, pastSolns) ;
            if (valueToConsider > maxValue) maxValue = valueToConsider ;
        }
        pastSolns.put(capacity, maxValue) ;
        return maxValue ;

    }

}
