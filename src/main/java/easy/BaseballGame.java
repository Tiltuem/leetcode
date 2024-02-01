package main.java.easy;



/*
https://leetcode.com/problems/baseball-game/
*/
public class BaseballGame {
    public static int calPoints(String[] operations) {
        int[] resultArray = new int[operations.length];

        int i = 0;
        for (String action : operations) {
            switch (action) {
                case "C" -> {
                    i--;
                    resultArray[i--] = 0;
                }
                case "D" -> resultArray[i] = resultArray[i - 1] * 2;
                case "+" -> resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
                default -> resultArray[i] = Integer.parseInt(action);
            }
            i++;
        }


        int result = 0;
        for (int n : resultArray) {
            result += n;
        }
        return result;
    }
}
