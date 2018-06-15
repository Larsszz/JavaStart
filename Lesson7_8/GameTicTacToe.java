package Lesson7_8;

import java.util.Scanner;

public class GameTicTacToe {
    public static void main(String[] args) {
        char[][] playingField = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game started. Make your moves.");
        System.out.println(" 012");
        int yField = 0;
        for (char[] i : playingField) {//print start field
            System.out.print(yField);
            for (char i1 : i) {
                System.out.print(i1);
            }
            yField++;
            System.out.println();
        }
        for (int steps = 0; steps < 9; steps++) {
            System.out.print("Player X enter coordinat Y: ");
            int xPlayerX = scanner.nextInt();
            System.out.print("Player X enter coordinat X: ");
            int yPlayerX = scanner.nextInt();
            movesOfX(playingField, xPlayerX, yPlayerX);
            if (winnerCheckerPlayerX(playingField)) {
                System.out.print("Player X WON!");
                break;
            }
            System.out.print("Player O enter coordinat Y: ");
            int xPlayerO = scanner.nextInt();
            System.out.print("Player O enter coordinat X: ");
            int yPlayerO = scanner.nextInt();
            movesOfO(playingField, xPlayerO, yPlayerO);
            if (winnerCheckerPlayerO(playingField)) {
                System.out.println("Player O WON!");
                break;
            }

        }
        if (winnerCheckerPlayerX(playingField) == false && winnerCheckerPlayerO(playingField) == false) {
            System.out.println("Draw");
        }

    }

    public static void movesOfX(char[][] field, int a, int b) {
        field[a][b] = 'x';
        for (char[] i : field) {
            for (char i1 : i) {
                System.out.print(i1);
            }
            System.out.println();
        }
    }

    public static void movesOfO(char[][] field, int a, int b) {
        field[a][b] = 'o';
        for (char[] i : field) {
            for (char i1 : i) {
                System.out.print(i1);
            }
            System.out.println();
        }
    }

    public static boolean winnerCheckerPlayerX(char[][] field) {
        for (int i = 0; i < 3; i++) {   //Check line
            if (field[i][0] == 'x' && field[i][1] == 'x' && field[i][2] == 'x') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {  //Check colum
            if (field[0][i] == 'x' && field[1][i] == 'x' && field[2][i] == 'x') {
                return true;
            }
        }
        if (field[0][0] == 'x' && field[1][1] == 'x' && field[2][2] == 'x') { //Check diagonal 1
            return true;
        }
        if (field[2][0] == 'x' && field[1][1] == 'x' && field[0][2] == 'x') { //Check diagonal 2
            return true;
        }
        return false;
    }

    public static boolean winnerCheckerPlayerO(char[][] field) {
        for (int i = 0; i < 3; i++) {   //Check lines
            if (field[i][0] == 'o' && field[i][1] == 'o' && field[i][2] == 'o') {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {  //Check colums
            if (field[0][i] == 'o' && field[1][i] == 'o' && field[2][i] == 'o') {
                return true;
            }
        }
        if (field[0][0] == 'o' && field[1][1] == 'o' && field[2][2] == 'o') { //Check diagonal 1
            return true;
        }
        if (field[2][0] == 'o' && field[1][1] == 'o' && field[0][2] == 'o') { //Check diagonal 2
            return true;
        }
        return false;
    }
}
