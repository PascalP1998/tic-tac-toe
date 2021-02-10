package com.game;

public class Main {

    public static void main(String[] args) {
        int turn = 0;
        int winner = -1;
        int[] board = new int[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = -1;
        }

        Player a = new Player(0);
        Player b = new Player(1);
        Player[] players = new Player[2];
        players[0] = a;
        players[1] = b;

        while (winner == -1) {
            printBoard(board);
            int turnField = players[turn].getTurn();
            if (players[turn].validateTurn(board, turnField)) {
                board[turnField] = players[turn].number;
                turn = (turn + 1) % 2;
            }
            winner = checkWinner(board);
        }
        System.out.println("Gratuliere Player " + winner + "! Du hast gewonnen!");
    }

    public static int checkWinner(int[] my_board) {
        int winner;
        if (my_board[0] == my_board[1] && my_board[0] == my_board[2] && my_board[0] != -1) {
            winner = my_board[0];
        } else if (my_board[3] == my_board[4] && my_board[3] == my_board[5] && my_board[3] != -1) {
            winner = my_board[3];
        } else if (my_board[6] == my_board[7] && my_board[6] == my_board[8] && my_board[6] != -1) {
            winner = my_board[6];
        } else if (my_board[0] == my_board[4] && my_board[0] == my_board[8] && my_board[0] != -1) {
            winner = my_board[0];
        } else if (my_board[2] == my_board[4] && my_board[2] == my_board[6] && my_board[2] != -1) {
            winner = my_board[2];
        } else if (my_board[0] == my_board[3] && my_board[0] == my_board[6] && my_board[0] != -1) {
            winner = my_board[0];
        } else if (my_board[1] == my_board[4] && my_board[1] == my_board[7] && my_board[1] != -1) {
            winner = my_board[1];
        } else if (my_board[2] == my_board[5] && my_board[2] == my_board[8] && my_board[2] != -1) {
            winner = my_board[2];
        } else {
            winner = -1;
        }
        return winner;
    }

    public static void printBoard(int[] my_board) {
        System.out.println(my_board[0] + " | " + my_board[1] + " | " + my_board[2]);
        System.out.println("_______________");
        System.out.println(my_board[3] + " | " + my_board[4] + " | " + my_board[5]);
        System.out.println("_______________");
        System.out.println(my_board[6] + " | " + my_board[7] + " | " + my_board[8]);
    }
}

