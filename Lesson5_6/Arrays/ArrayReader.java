package Lesson5_6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReader {
    public static void main(String[] args) {
        Scanner scSize = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scSize.nextInt();
        Scanner scNum = new Scanner(System.in);
        System.out.print("Enter elements: ");
        String inArray = scNum.nextLine();
        String stringArray[] = inArray.split(" ", size);
        int numberArray[] = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            numberArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(Arrays.toString(numberArray));
    }
}
