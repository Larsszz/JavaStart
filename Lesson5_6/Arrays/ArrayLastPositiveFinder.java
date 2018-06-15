package Lesson5_6.Arrays;

public class ArrayLastPositiveFinder {
    public static void main(String[] args) {
        int array[] = {-3, -1, -20, -2, -10, 0};
        int positiveCount = 0;
        for (int i : array) {
            if (i > 0) {
                positiveCount = i;
            }
        }
        if (positiveCount == 0) {
            int min = Integer.MIN_VALUE;
            positiveCount = min;
        }
        System.out.println(positiveCount);
    }
}
