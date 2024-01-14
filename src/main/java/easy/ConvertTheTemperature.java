package main.java.easy;

/*
https://leetcode.com/problems/convert-the-temperature/
*/
public class ConvertTheTemperature {
    public static double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
