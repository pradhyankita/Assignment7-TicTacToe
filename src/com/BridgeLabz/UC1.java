package com.BridgeLabz;

public class UC1 {
    public static void main(String[] args) {

        System.out.println("Welcome To TicTacToe Game!!! ");
        char[][] board = new char[3][3];
        drawBoard(board);
    }

    public static void drawBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println("Board:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
