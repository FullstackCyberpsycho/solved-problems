package problem3;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("sum 0: " + sumCalculator.sum() +
                "\nsum 1: " + sumCalculator.sum(1) +
                "\nsum 2: " + sumCalculator.sum(1,2) +
                "\nsum 3: " + sumCalculator.sum(1,2,3) +
                "\nsum 4: " + sumCalculator.sum(1,2,3,4) +
                "\n---------");
    }
}

class SumCalculator {
    private int res;

    public int sum() {
        return res;
    }

    public int sum(int num1) {
        res = num1 + num1;
        return res;
    }

    public int sum(int num1, int num2) {
        res = num1 + num2;
        return res;
    }
    public int sum(int num1, int num2, int num3) {
        res = num1 + num2 + num3;
        return res;
    }
    public int sum(int num1, int num2, int num3, int num4) {
        res = num1 + num2 + num3 + num4;
        return res;
    }
}