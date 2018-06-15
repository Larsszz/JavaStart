package Lesson5_6.Arrays;

public class SortedChecker {
    public static void main(String[] args) {
        int array[] = {0, 20, 30, 40};
        boolean isSorted = true;
        int a = array[0];
        for (int i = 1 , sort = array[i]; i < array.length; i++) {
            if (sort < a) {
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
