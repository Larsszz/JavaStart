package Lesson3_4;

public class LuckyTicket {
    public static void main(String[] args) {
        int numberOfTicket = 123124;
        boolean result;
        if (numberOfTicket <= 999999) {
            int n1 = numberOfTicket % 10;
            int n2 = (numberOfTicket / 10) % 10;
            int n3 = (numberOfTicket / 100) % 10;
            int n4 = (numberOfTicket / 1000) % 10;
            int n5 = (numberOfTicket / 10000) % 10;
            int n6 = (numberOfTicket / 100000) % 10;
            if ((n1 + n2 + n3) == (n4 + n5 + n6)) {
                result = true;
            } else {
                result = false;
            }
            System.out.println(result);
        }
        else {
            System.out.println("Error");
            System.exit(-1);
        }
    }
}
