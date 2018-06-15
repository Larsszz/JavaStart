package Lesson3_4;

import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter yor surname: ");
        String surname = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("I`m "+name+" "+surname+", "+age+" years old.");

        /* SYSTEM OUT:
        Enter your name: Ivan
        Enter yor surname: Ivanovich
        Enter your age: 25
        I`m Ivan Ivanovich, 25 years old.
        */
    }
}
