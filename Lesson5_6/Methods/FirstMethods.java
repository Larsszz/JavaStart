package Lesson5_6.Methods;

public class FirstMethods {
    public static void main(String[] args) {
        System.out.println(summ(1,2));
    }



    public static int summ(int a, int b) { //                 1
        int summ = a + b;
        return summ;
    }



    public static boolean isAge(int a) { //                   2
        boolean isAge = false;
        if (a > 1 && a < 121) {
            isAge = true;
        }
        return isAge;
    }



    public static char lastChar(String s) { //               3
        char ch = 0;
        if (s.length() <= 0) {
            System.out.println("Error");
            System.exit(-1);
        } else {
            ch = s.charAt(s.length() - 1);
        }
        return ch;
    }



    public static int rangeSumm(int from, int to) { //                 4
        int rangeSumm = 0;
        if (from > to) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int filler = from; filler <= to; filler++) {
            rangeSumm += filler;
        }
        return rangeSumm;
    }



    public static void PrintEvents(int from, int to) { //                 5
        if (from > to) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int filler = from; filler <= to; filler++) {
            if (filler%2==0) {
                System.out.print(filler + " ");
            }
        }
    }
}
