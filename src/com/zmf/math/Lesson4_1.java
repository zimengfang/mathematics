package com.zmf.math;

public class Lesson4_1 {
    public static void main(String[] args) {

        int grid = 63;
        long start, end = 0;
        start = System.currentTimeMillis();
        System.out.println(String.format(" 舍罕王给了这么多粒：%d", Lesson3_1.getNumberOfWheat(grid)));
        end = System.currentTimeMillis();
        System.out.println(String.format(" 耗时 %d 毫秒 ", (end - start)));

        start = System.currentTimeMillis();
        System.out.println(String.format(" 舍罕王给了这么多粒：%d", (long)(Math.pow(2, grid)) - 1));
        end = System.currentTimeMillis();
        System.out.println(String.format(" 耗时 %d 毫秒 ", (end - start)));

    }

}
