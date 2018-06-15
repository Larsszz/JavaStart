package Lesson5_6.Arrays;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        int array[] = {2,3,7,9,5};
        double summ = 0;
        if (array.length<=0) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int i:array) {
            summ += i;
        }
        double averageOfArray = summ/array.length;
        System.out.println(averageOfArray);
    }
}
