package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();

        Random random = new Random();
        int min = 5;
        int max = 10;
        int numSize = random.nextInt(max - min + 1) + min;
        int num = random.nextInt(10);

        for (int i = 0; i < numSize; i++) {
            num = random.nextInt(10);
            nums.add(num);
        }

        Sum sum = new Sum(nums);
        System.out.print("Список цифр: " + nums +
                "\nСумма четных чисел: "); sum.getSum();
        System.out.println(" = " + sum.getSumAll());
    }
}