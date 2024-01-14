package main.java.easy;

/*
https://leetcode.com/problems/defanging-an-ip-address/
*/
public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
