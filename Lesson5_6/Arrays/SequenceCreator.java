package Lesson5_6.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size<0) {
            System.out.println("Error");
            System.exit(-1);
        }
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
