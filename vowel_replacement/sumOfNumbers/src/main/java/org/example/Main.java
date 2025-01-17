package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static int sum(ArrayList<Integer> nums) {
        int res = nums.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();

        return res;
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(8);

        /*Random random = new Random();
        int min = 5;
        int max = 10;
        int numSize = random.nextInt(max - min + 1) + min;
        int num = random.nextInt(10);

        for (int i = 0; i < numSize; i++) {
            num = random.nextInt(10);
            nums.add(num);
        }

        Sum sum = new Sum(nums);
        System.out.println("Найти сумму всех четных чисел в списке");
        System.out.print("Список цифр: " + nums +
                "\nСумма четных чисел: "); sum.printSum();
        System.out.println(" = " + sum.getSumAll());

        System.out.println("Ответ: " + sum.getSum());*/

        System.out.println("Сумма четных чисел: " + sum(nums));
    }
}