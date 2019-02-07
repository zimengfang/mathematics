package com.zmf.math;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson7_3 {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        range(l, new ArrayList<>());
    }
    /**
     * 排列
     *
     * @param passwords 待排列的字符
     * @param results 排列的结果
     ***/
    public static void range(ArrayList<String> passwords, ArrayList<String> results) {
        //如果为空则不需要排列
        if (passwords.isEmpty()) {
            String collect = String.join("", results);
            System.out.print(collect + "\t");
        }

        for (int i = 0; i < passwords.size(); i++) {
            String password = passwords.get(i);
            ArrayList<String> newResult = (ArrayList<String>) results.clone();
            ArrayList<String> newPassword = (ArrayList<String>) passwords.clone();
            newResult.add(password);
            newPassword.remove(i);
            range(newPassword,newResult);
        }
    }
}
