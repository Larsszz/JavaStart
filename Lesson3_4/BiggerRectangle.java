package Lesson3_4;

public class BiggerRectangle {
    public static void main(String[] args) {
        int widht1 = 10;
        int heigth1 = 20;
        int widht2 = 40;
        int heigth2 = 30;
        int square1 = widht1 * heigth1;
        int square2 = widht2 * heigth2;
        if (square1 >= 0) {
            if (square2 >= 0) {
                if (square1 > square2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
            else {
                System.out.println("Error");
                System.exit(-1);
            }
        }
        else {
            System.out.println("Error");
            System.exit(-1);
        }
    }
}
