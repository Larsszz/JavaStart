package Lesson3_4;

import java.util.Scanner;

public class BmiInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter weight: ");
        weight = scan.nextDouble();
        System.out.println("Enter height: ");
        height = scan.nextDouble();
        if (weight <= 0 || height <= 0){
            System.out.println("Error");
            System.exit(-1);
        }
        double bmi = weight/Math.pow(height, 2);
        if (bmi <= 18.5){
            System.out.println("Underweight");
        }else if (bmi > 18.5 && bmi <= 25.0){
            System.out.println("Normal");
        }else {
            System.out.println("Overweight");
        }

    }
}