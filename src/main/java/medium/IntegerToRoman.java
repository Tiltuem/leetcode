package main.java.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
https://leetcode.com/problems/integer-to-roman
 */
public class IntegerToRoman {
    private static final HashMap<Integer, String> NUM_TO_ROMAN_MAP = new LinkedHashMap<>() {
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    public static String intToRoman(int n) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : NUM_TO_ROMAN_MAP.entrySet()) {
            while (n >= entry.getKey()) {
                result.append(entry.getValue());
                n -= entry.getKey();
            }
        }

        return result.toString();
    }
}
