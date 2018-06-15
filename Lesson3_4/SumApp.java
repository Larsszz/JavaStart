package Lesson3_4;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summ = 0;
        int clientNum;
        System.out.println("Enter your num: ");
        do {
            clientNum = sc.nextInt();
            summ += clientNum;
        } while (clientNum != 0);
        System.out.println("Sum of num: "+summ);
    }
}
