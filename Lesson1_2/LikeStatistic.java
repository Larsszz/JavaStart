package Lesson1_2;

public class LikeStatistic {
    public static void main(String[] args) {
        long likesCount = 102; // Input: any valid number of likes
        int registrationYear = 2014; // Input: any valid registration year
        int currentYear = java.time.Year.now().getValue();

        double likesPerYear = (double) likesCount / ((currentYear + 1) - registrationYear); // Your formula

        System.out.println(likesPerYear + " likes / year");
    }

}
