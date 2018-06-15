package Lesson3_4;

public class CharsCounter {
    public static void main(String[] args) {
        String s = "Hello, World!";
        char ch = 'l';
        int matches = 0;
        int leng = s.length();
        for (int i = 0; i < leng; i++) {
            if (s.charAt(i) == ch) {
                matches++;
            }
        }
        System.out.println(matches);
    }
}
