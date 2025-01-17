package org.example;

import java.util.ArrayList;

public class Main {
    public static String filter(ArrayList<String> listArr) {
        StringBuilder res = new StringBuilder();
        for (String elem : listArr) {
            if (elem.length() > 5) {
                res.append(elem.toUpperCase()).append(" ");
            }
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        ArrayList<String> listArr = new ArrayList<>();
        listArr.add("apple");
        listArr.add("banana");
        listArr.add("cat");
        listArr.add("dog");
        listArr.add("elephant");

        System.out.println(filter(listArr));
        filter(listArr);
    }
}