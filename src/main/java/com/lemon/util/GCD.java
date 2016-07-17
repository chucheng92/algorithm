package com.lemon.util;

/**
 * Created by taoxiaoran on 16/3/31.
 */

public class GCD {
    public int getGCD(int a, int b) {
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new GCD().getGCD(3, 11));
    }
}
