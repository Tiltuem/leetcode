package main.java.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRow {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        String[] rows = new String[]{"[qwertyuiop]", "[asdfghjkl]", "[zxcvbnm]"};

        for (String word : words) {
            for (String row : rows) {
                if (word.toLowerCase().replaceAll(row, "").length() == 0) {
                    result.add(word);
                    break;
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
