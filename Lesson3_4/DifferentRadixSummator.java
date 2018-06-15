package Lesson3_4;

import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X in Bin: ");
        String x = sc.next();
        System.out.print("Enter Y in Oct: ");
        String y = sc.next();
        System.out.print("Enter Z in Hex: ");
        String z = sc.next();
        int summ = Integer.parseInt(x, 2) + Integer.parseInt(y, 8) + Integer.parseInt(z, 16);
        System.out.println("X + Y + Z = " + summ);
        /*
        System out:
        Enter X in Bin: 1011
        Enter Y in Oct: 73
        Enter Z in Hex: ABC
        X + Y + Z = 2818
         */
    }
}
