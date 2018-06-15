package Lesson3_4;

import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        sc.close();
        double func = Math.log(Math.sin(x)+Math.exp(x)*(Math.sqrt(x)/Math.PI));
        System.out.print("f(x) = " + func);
        /*
        Enter x: 0,5
        f(x) = -0.16190946372347814
         */
    }
}
