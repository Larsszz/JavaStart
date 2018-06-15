package Lesson3_4;

import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        String out = "Hi, my name is ${name}";
        System.out.print(out.replaceAll("\\$\\{name\\}", name));
        /*
        System out:
        Enter your name: Jonh
        Hi, my name is Jonh
         */
    }
}
