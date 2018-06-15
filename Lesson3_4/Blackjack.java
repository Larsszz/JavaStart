package Lesson3_4;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card A: ");
        int cardA = scanner.nextInt();
        System.out.print("Enter card B: ");
        int cardB = scanner.nextInt();
        if (cardA >= 0) {
            if (cardB >= 0) {
                if (cardA > cardB) {
                    if (cardA <= 21) {
                        System.out.println(cardA);
                    } else {
                        if (cardB <= 21) {
                            System.out.println(cardB);
                        } else {
                            System.out.println(0);
                        }
                    }
                } else {
                    if (cardB <= 21) {
                        System.out.println(cardB);
                    } else {
                        if (cardA <= 21) {
                            System.out.println(cardA);
                        } else {
                            System.out.println(0);
                        }
                    }
                }
            }
            else {
                System.out.println("Error");
                System.exit(-1);
            }
        }
        else {
            System.out.println("Error");
            System.exit(-1);
        }
    }
}
