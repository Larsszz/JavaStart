package Lesson7_8;

public class SymbolsTextFinders {
    public static void main(String[] args) {
        int countOfSymbols = 0;
        String s = "Treating objects as service providers is a great simplifying tool. This is useful not only during the design process, but also when someone else is trying to understand your code or reuse an object. If they can see the value of the object based on what service it provides, it makes it much easier to fit it into the design.";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i') {
                countOfSymbols++;
            }
        }
        System.out.println("Summ of symbols = " + countOfSymbols);
    }
}
