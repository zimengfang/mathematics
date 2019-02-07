package com.zmf.math;

import java.util.Arrays;

public class Lesson3_3 {

    public static void main(String[] args) {

        String[] dictionary = {"i", "am", "a", "python", "coder", "java", "in", "nothing"};
        Arrays.sort(dictionary);
        String wordToFind = "java";
        boolean found = search(dictionary, wordToFind);
        if (found) {
            System.out.println(String.format(" 找到了单词 %s", wordToFind));
        } else {
            System.out.println(String.format(" 未能找到单词 %s", wordToFind));
        }
    }


    public static boolean search(String[] dictionary, String word) {
        if (dictionary == null) {
            return false;
        }
        if (dictionary.length == 0) {
            return false;
        }
        int left = 0, right = dictionary.length - 1;
        while (left <= right) {
            //防止溢出
            int middle = left + (right - left) / 2;
            if (dictionary[middle].equals(word)) {
                return true;
            } else {
                if (dictionary[middle].compareTo(word) > 0) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return false;
    }
}
