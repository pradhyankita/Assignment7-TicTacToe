package com.BridgeLabz;

public class UC3 {
public static void main (String [] args){
showBoard();
}
public static void showBoard(){
    char[][] board ={{'1','2','3'},
                       {'4','5','6'},
                         {'7','8','9'}};
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] );
    System.out.println("-+-+-");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] );
    System.out.println("-+-+-");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] );

}
}
