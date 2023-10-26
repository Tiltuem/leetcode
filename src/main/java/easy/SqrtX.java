package main.java.easy;

/*
https://leetcode.com/problems/sqrtx
 */
public class SqrtX {
    public  int mySqrt(int num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        double x = num;
        double y = 1;
        double eps = 0.000001;

        while (x - y > eps) {
            x = (x + y) / 2;
            y = num / x;
        }

        return (int) x;
    }
}
