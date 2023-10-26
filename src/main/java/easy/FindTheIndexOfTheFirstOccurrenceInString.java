package main.java.easy;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 */
public class FindTheIndexOfTheFirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }
        else if (needle.length() == haystack.length()) {
            if (needle.equals(haystack)) {
                return 0;
            }
            else {
                return -1;
            }
        }

        int i = 0;

        while (needle.length() + i <= haystack.length()) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
            i++;
        }

        return -1;
    }
}
