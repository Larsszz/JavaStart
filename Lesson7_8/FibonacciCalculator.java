package Lesson7_8;

import java.math.BigInteger;

public class FibonacciCalculator {
    public static void main(String[] args) {
        int countOfPhibonachi = 10000;
        BigInteger numberOfPhibonachi = new BigInteger("0");
        if (countOfPhibonachi == 0) {
            numberOfPhibonachi = new BigInteger("0");
        }
        if (countOfPhibonachi == 1) {
            numberOfPhibonachi = new BigInteger("1");
        } else {
            BigInteger f1 = new BigInteger("0");
            BigInteger f2 = new BigInteger("1");
            for (int i = 0; i <= countOfPhibonachi; i++) {
                numberOfPhibonachi = f1.add(f2);
                f1 = f2;
                f2 = numberOfPhibonachi;
            }
        }
        System.out.println("Number of count " + countOfPhibonachi + " of Fibonacci = " + numberOfPhibonachi);
    }
}
