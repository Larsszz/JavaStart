package Lesson1_2;

public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 54271;  // Input: any positive number
        int n1 = n%10;
        int n2 = (n/10)%10;
        int n3 = (n/100)%10;
        int n4 = (n/1000)%10;
        int n5 = (n/10000)%10;
        System.out.println(n5);
        System.out.println(n4);
        System.out.println(n3);
        System.out.println(n2);
        System.out.println(n1);
    }

}
