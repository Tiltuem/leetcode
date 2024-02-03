package main.java.easy;

/*
https://leetcode.com/problems/add-binary/
*/
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;
        int sum;

        while(i >= 0 || j >= 0){
            sum = temp;
            if(i>=0) {
                sum += a.charAt(i--) - '0';
            }
            if(j>=0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            temp = sum / 2;
        }

        if(temp > 0 ) {
            result.append(temp);
        }

        return result.reverse().toString();
    }
}
