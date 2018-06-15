package Lesson3_4;

public class DaysOfMonth {
    public static void main(String[] args) {
        int month = 5;
        int daysOfMonth;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysOfMonth = 31;
                    System.out.println(daysOfMonth);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysOfMonth = 30;
                    System.out.println(daysOfMonth);
                    break;
                case 2:
                    daysOfMonth = 28;
                    System.out.println(daysOfMonth);
                    break;

            }

        } else {
            System.out.println("Error");
            System.exit(-1);
        }
    }
}
