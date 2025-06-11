package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArg3RunsWell();
    }

    // Test case 1: Verify getFactorial() with n = 0
    public static void verifyFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = expected: " + expected + " | actual: " + actual);
        System.out.println(expected == actual ? "Status: PASSED" : "Status: FAILED");
    }
    // Test case 2: Verify getFactorial() with n = 1
    public static void verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = expected: " + expected + " | actual: " + actual);
        System.out.println(expected == actual ? "Status: PASSED" : "Status: FAILED");
    }
    // Test case 3: Verify getFactorial() with n = 2
    public static void verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2;
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! = expected: " + expected + " | actual: " + actual);
        System.out.println(expected == actual ? "Status: PASSED" : "Status: FAILED");
    }
    // Test case 3: Verify getFactorial() with n = 3
    public static void verifyFactorialGivenRightArg3RunsWell() {
        int n = 3;
        long expected = 6;
        long actual = MathUtility.getFactorial(n);
        System.out.println("3! = expected: " + expected + " | actual: " + actual);
        System.out.println(expected == actual ? "Status: PASSED" : "Status: FAILED");
    }
}
