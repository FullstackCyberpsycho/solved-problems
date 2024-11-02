package problem1;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void sum(ArrayList<Integer> nums) {
        int sumRes = 0;
        for(int elem : nums) {
            if (elem > 0) {
                sumRes += elem;
            }
        }
        System.out.println("sum positive numbers: "
                + sumRes);
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num, sizeArr;
        System.out.print("Enter size ArrayList: ");
        sizeArr = scan.nextInt();
        for (int i = 0; i < sizeArr; i++) {
            System.out.print("Enter number: ");
            num = scan.nextInt();
            nums.add(num);
        }
        Main.sum(nums);
    }
}
