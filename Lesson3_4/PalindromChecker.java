package Lesson3_4;

public class PalindromChecker {
    public static void main(String[] args) {
        String s = "maodoam";
        String b = new StringBuffer(s).reverse().toString();
        boolean c = s.matches(b);
        System.out.println(c);
    }
}
