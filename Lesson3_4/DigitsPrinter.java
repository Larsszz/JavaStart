package Lesson3_4;

import java.util.Arrays;
import java.util.Scanner;


// Вывести в консоль цифры целого числа. Если число отрицательное, дополнять знаком «-».
public class DigitsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int scannerNum = scanner.nextInt();

        if (scannerNum < 0) {
            scannerNum = scannerNum + (-scannerNum) + (-scannerNum);
            System.out.print("- ");
        }
        int delitel = 1;
        int[] arrayOfNum = new int[(int) Math.ceil(Math.log10(scannerNum + 0.5))];
        for (int i = arrayOfNum.length - 1; i >= 0; i--) {
            arrayOfNum[i] = (scannerNum / delitel) % 10;
            delitel *= 10;
        }
        System.out.print(Arrays.toString(arrayOfNum));
        
    }
}
