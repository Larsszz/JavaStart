package Lesson3_4;

public class EventsRandePrinter {
    public static void main(String[] args) {
        int first = 2;
        int last = 10;
        if (last >= first) {
            do {
                if (first % 2 == 0) {
                    System.out.println(first);
                }
                first++;
            } while (first <= last);
        }
    }
}
