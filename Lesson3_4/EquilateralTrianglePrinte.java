package Lesson3_4;

import java.util.Scanner;

public class EquilateralTrianglePrinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int fillerStolb = 0; fillerStolb<=size; fillerStolb++) {
            for (int fillerString = 1; fillerString <= (size + (size - 1)); fillerString++) {
                if ((fillerString <= (size - fillerStolb)) || (fillerString > ((size + (size - 1)) - (size - fillerStolb)))) {
                    System.out.print(" ");
                }
                if ((fillerString > (size - fillerStolb)) && (fillerString <= ((size + (size - 1)) - (size - fillerStolb)))) {
                    System.out.print("^");
                }
            }
            System.out.println();
        }
    }
}
