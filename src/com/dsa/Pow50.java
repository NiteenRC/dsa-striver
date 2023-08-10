package com.dsa;

public class Pow50 {
    public double myPow(double x, int n) {
        return method1(x, n);
    }

    public double method1(double x, int n) {
        if (n == 0) return 1;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double halfPow = method1(x, n / 2);
        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return x * halfPow * halfPow;
        }
    }


    private double method2(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            n = -n;
            x = 1.0 / x;
        }

        double result = 1;

        while (n != 0) {
            // If 'n' is odd we multiply result with 'x' and reduce 'n' by '1'.
            if (n % 2 == 1) {
                result *= x;
                n -= 1;
            }
            // We square 'x' and reduce 'n' by half, x^n => (x^2)^(n/2).
            x = x * x;
            n /= 2;
        }
        return result;
    }
}
