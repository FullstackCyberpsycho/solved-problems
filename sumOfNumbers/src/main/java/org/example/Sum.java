package org.example;

import java.util.ArrayList;

public class Sum {
    private ArrayList<Integer> nums;

    public Sum(ArrayList<Integer> nums) {
        this.nums = nums;
    }

    public int getSumAll() {
        int resSum = 0;
        for (int i = 0; i < nums.size(); i++) {
           if (nums.get(i) % 2 == 0) {
               resSum += nums.get(i);
           }
        }
        return resSum;
    }

    public void getSum() {
        int resSum = 0;
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
}
