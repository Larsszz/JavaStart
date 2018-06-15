package Lesson3_4;

public class PrimeChecker {
    public static void main(String[] args) {
        int n = 8;
        boolean b = true;
        if (n <= 0) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0 || n == 1) {
                b = false;
            }
        }
        System.out.println(b);
    }
}
