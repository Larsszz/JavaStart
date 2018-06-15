package Lesson3_4;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size<=0) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
            for (int j = 2; j <= size; j++) {
                System.out.print(i * j + " ");
                if (j == size) {
                    System.out.println();
                }

            }
        }
    }
}