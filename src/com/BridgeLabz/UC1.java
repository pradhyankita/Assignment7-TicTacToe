package com.BridgeLabz;

public class UC1 {
    public static void main(String[] args) {

        System.out.println("Welcome To TicTacToe Game!!! ");
        char[][] board = new char[10][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        drawBoard(board);
        useCase2();
        useCase3();
        useCase4();
        useCase5();
        useCase6();
        useCase7();
        useCase8();
        useCase9();
        useCase10();
        useCase11();
        useCase12();
        useCase13();

    }
    private static void useCase13() {
    }
    private static void useCase12() {
    }
    private static void useCase11() {
    }
    private static void useCase10() {
    }
    private static void useCase9() {
    }
    private static void useCase8() {
    }
    private static void useCase7() {
    }
    private static void useCase6() {
    }
    private static void useCase5() {
    }
    private static void useCase4() {
    }
    private static void useCase3() {
    }

    private static void useCase2() {
    }

    public static void drawBoard(char[][] board) {

        System.out.println("Board:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
