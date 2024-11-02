package problem6;

public class Main {
    public static StringBuilder reverseString(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                reverseStr.reverse();
            } else {
                // ?
            }
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello, world!"));
    }
}
