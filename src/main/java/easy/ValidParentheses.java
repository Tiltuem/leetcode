package main.java.easy;

import java.util.Stack;

/*
https://leetcode.com/problems/valid-parentheses
*/
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stackBrackets = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == ')' || i == '}' || i == ']') {
                if (stackBrackets.isEmpty()) {
                    return false;
                }

                if (i == ')' && stackBrackets.peek() != '('
                        || i == '}' && stackBrackets.peek() != '{'
                        || i == ']' && stackBrackets.peek() != '[') {
                    return false;
                }

                stackBrackets.pop();
            } else stackBrackets.push(i);
        }

        return stackBrackets.isEmpty();
    }
}
