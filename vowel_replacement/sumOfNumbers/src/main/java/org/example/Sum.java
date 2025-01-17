/*package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum {
    private int resSum = 0;
    private ArrayList<Integer> nums;

    public Sum(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    public int getSumAll() {
        for (int i = 0; i < nums.size(); i++) {
           if (nums.get(i) % 2 == 0) {
               resSum += nums.get(i);
           }
        }
        return resSum;
    }

    public void printSum() {
        boolean isFirstEvenNumber = true;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                if (!isFirstEvenNumber) {
                    System.out.print(" + ");
                } else {
                    isFirstEvenNumber = false;
                }
                System.out.print(nums.get(i));
            }
        }
    }

    public int getSum() {
        resSum = 0;
        List<Integer> evenNum = nums.stream().map(e -> {
            if (e % 2 == 0) {
                resSum += e;
            }
            return resSum;
        }).collect(Collectors.toList());

        return evenNum.get(nums.size() - 1);
    }
}
*/