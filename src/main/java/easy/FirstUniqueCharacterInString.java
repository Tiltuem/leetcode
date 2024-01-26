package main.java.easy;

/*
https://leetcode.com/problems/first-unique-character-in-a-string
*/
public class FirstUniqueCharacterInString {

    public static int firstUniqChar(String s) {
        int temp;
        char cur;

        for (int i = 0; i < s.length(); i++) {
            cur = s.charAt(i);
            temp = s.lastIndexOf(cur);
            if (temp != -1 && temp == s.indexOf(cur)) {
                return temp;
            }
        }

        return -1;
    }
}
