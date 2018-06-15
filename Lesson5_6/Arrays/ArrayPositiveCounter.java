package Lesson5_6.Arrays;

public class ArrayPositiveCounter {
    public static void main(String[] args) {
        int array[] = {-5, 2, -4, 1, 5, 7, -8};
        int countPositives = 0;
        for (int i : array) {
            if (i > 0) {
                countPositives++;
            }
        }
        System.out.println("Positive counts = " + countPositives);
    }
}
