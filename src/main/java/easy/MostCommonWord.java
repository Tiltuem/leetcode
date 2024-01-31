package main.java.easy;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.toLowerCase().replaceAll("[!?',;.]", " ").split(" ");
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.equals("")) {
                wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);

            }
        }

        Map.Entry<String, Integer> result = wordsCount.entrySet().stream().max(Map.Entry.<String, Integer>comparingByValue()).get();
        return result.getKey();
    }
}
