package com.game;

import java.util.Scanner;

public class Player {
    int number;
    Scanner scanner = new Scanner(System.in);

    public Player(int number) {
        this.number = number;
    }

    public int getTurn() {
        System.out.println("Player " + number + " - du bist am Zug!");
        int input = scanner.nextInt();
        if (input < 9 && input >= 0) {
            return input;
        } else {
            System.out.println("Ungültig. Bitte gib eine Zahl zwischen 0 bis 8 ein.");
            return getTurn();
        }
    }

    public boolean validateTurn(int[] my_board, int turn) {
        if (my_board[turn] == -1) {
            return true;
        } else {
            return false;
        }
    }


}
