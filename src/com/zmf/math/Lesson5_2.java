package com.zmf.math;

import java.util.ArrayList;

public class Lesson5_2 {

    public static void main(String[] args){
        long total = 8;
        recursion(total, new ArrayList<>());
    }

    public static void recursion(long total, ArrayList<Long> result) {

        if (total == 1) {
            if (!result.contains(1L)) result.add(1L);
            System.out.println(result);
            return;
        } else {
            for (long i = 1; i <= total; i++) {
                if ((i == 1) && result.contains(1L)) continue;
                ArrayList<Long> newList = (ArrayList<Long>) (result.clone());
                newList.add(Long.valueOf(i));
                if (total % i != 0) {
                    continue;
                }
                recursion(total / i, newList);
            }
        }
    }
}
