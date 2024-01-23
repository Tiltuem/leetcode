package main.java.easy;

/*
https://leetcode.com/problems/reverse-string
*/
public class ReverseString {
    public static void reverseString(char[] s) {
        char temp;
        int length = s.length;

        for (int i = 0; i < length / 2; i++) {
            temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }
}
