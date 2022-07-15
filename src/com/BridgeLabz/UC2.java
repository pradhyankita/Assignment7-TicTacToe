package com.BridgeLabz;
import java.util.Scanner;
public class UC2 {
    public static void main(String[] args) {

        System.out.println("Welcome To TicTacToe Game!!! ");
        char[][] board = new char[10][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
                drawBoard(board);

                player();
            }
        }
    }

    public static void drawBoard(char[][] board) {

        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static void player() {

        boolean player1 = true;
        char[][] board = new char[10][10];
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play Tic Tac Toe!");
        System.out.print("Player 1, what is your name? ");
        String p1 = in.nextLine();
        System.out.print("Player 2, what is your name? ");
        String p2 = in.nextLine();
        //Create a gameEnded boolean and use it as the condition in the while loop
        boolean gameEnded = false;
        while (!gameEnded) {
            drawBoard(board);
            //Print whose turn it is
            if (player1) {
                System.out.println(p1 + "'s Turn (x):");
            } else {
                System.out.println(p2 + "'s Turn (o):");
            }
            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }
        }
    }
}




