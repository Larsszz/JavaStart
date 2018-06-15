package Lesson5_6.Arrays;

import java.util.Arrays;

public class VectorSumCalculator {
    public static void main(String[] args) {
        int firstArray[] = {10, 30, 20};
        int secondArray[] = {2, 3};
        int lowArray;
        if (firstArray.length < secondArray.length) {
            lowArray = firstArray.length;
        } else {
            lowArray = secondArray.length;
        }
        int summArray[] = new int[lowArray];
        for (int i1 = 0; i1 < lowArray; i1++) {
            int firstFiller = firstArray[i1];
            int secondFiller = secondArray[i1];
            int summFiller = firstFiller + secondFiller;
            summArray[i1] = summFiller ;
        }
        System.out.println(Arrays.toString(summArray));
    }
}
