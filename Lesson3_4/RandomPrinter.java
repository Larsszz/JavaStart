package Lesson3_4;

import java.util.Scanner;

public class RandomPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        System.out.print("Enter min: ");
        int min = sc.nextInt();
        System.out.print("Enter max: ");
        int max = sc.nextInt();
        if (count <= 0 || min >= max) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int i = 1; i<=count; i++) {
            int random =(int) (Math.random()*(max-min))+min;
            System.out.println(random);
        }
    }
}
