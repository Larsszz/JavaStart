import java.util.Scanner;
public class Ugadayka {
    public static void main(String[] args) {
        int prog, user;
        prog = (int)(Math.random() * 20) - 10;
        while (prog == 0){
            prog = (int)(Math.random() * 20) - 10;
        }
        System.out.println("Я загадала число от -10 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        int popitki = 0;
        if( input.hasNextInt() ) {
            do {
                user = input.nextInt();
                popitki++;
                if(user == prog) {
                    System.out.println("Вы угадали!");
                }
                else {
                    if (user >= -10 && user <= 10) {
                        System.out.println("Вы не угадали! ");
                        if (prog == (-user)){
                            System.out.println("Угадали, но не с тем знаком");
                        }
                        else if ( prog < user ) {
                            System.out.println("Моё число меньше.");
                        }
                        else {
                            System.out.println("Моё число больше.");
                        }
                    }
                    else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            }
            while( user != prog );
        }
        else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("Ваше количкство попыток = "+popitki);
        System.out.println("До свиданья!");
    }
}