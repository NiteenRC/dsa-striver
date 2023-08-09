package com.dsa;

public class FactorialTrailing172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }

    public static int trailingZeroes(int n) {
        int count = 0;

        while (n != 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
