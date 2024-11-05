package org.example;

public class Main {
    public static StringBuilder vowelReplacement(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i)
                    == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' ||
                    text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i)
                    == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {

                stringBuilder.setCharAt(i, '*');
            }
        }
        return stringBuilder;
    }
    public static void main(String[] args) {
        System.out.println(vowelReplacement("Hello, world!"));
        //System.out.println(vowelReplacement("Programming is fun!"));
        //System.out.println(vowelReplacement("I love AI!"));
    }
}
