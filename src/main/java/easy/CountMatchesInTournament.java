package main.java.easy;

/*
https://leetcode.com/problems/count-of-matches-in-tournament/
*/
public class CountMatchesInTournament {
    private static int result;

    public static int numberOfMatches(int n) {
        result = 0;
        int teams = calc(n);

        do {
            teams = calc(teams);
        } while (teams != 1);

        return result;
    }

    public static int calc(int n) {
        if (n % 2 == 0) {
            result += n / 2;
            return n / 2;
        }

        result += (n - 1) / 2;
        return (n - 1) / 2 + 1;
    }
}
