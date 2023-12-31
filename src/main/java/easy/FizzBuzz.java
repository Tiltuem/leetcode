package main.java.easy;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/fizz-buzz/description/
*/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
    /*public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder str;

        for (int i = 1; i <= n; i++) {
            str = new StringBuilder();

            if (i % 3 == 0) {
                str.append("Fizz");
            }
            if (i % 5 == 0) {
                str.append("Buzz");
            }

            if (str.length() == 0) {
                result.add(String.valueOf(i));
            } else {
                result.add(str.toString());
            }
        }

        return result;
    }*/
}
