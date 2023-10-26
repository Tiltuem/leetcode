package main.java.easy;

/*
https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String text = s.trim();
        int count = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == ' ') {
                return count;
            } else {
                count++;
            }
        }

        return count;
    }
}
