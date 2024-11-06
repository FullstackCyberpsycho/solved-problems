package org.example;

import java.util.concurrent.CompletionException;

public class Main {
    public static String vowelReplacement(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                stringBuilder.setCharAt(i, '*');
            }
        }
        String textVowelR = stringBuilder.toString();

        return textVowelR;
    }

    public static String vowelReplacement(int text) {
        return "Error!";
    }

    public static void main(String[] args) {
        System.out.println(vowelReplacement("Hello, world!"));
        //System.out.println(vowelReplacement("Programming is fun!"));
        //System.out.println(vowelReplacement("I love AI!"));
    }
}