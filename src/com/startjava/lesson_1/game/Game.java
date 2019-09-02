package com.startjava.lesson_1.game;

public class Game {
    public static void main(String[] args) {
        int puzzleNumber = 45;
        int playerNumber;  // число от 1 до 1000
        for (playerNumber = 1; playerNumber <= 1000; playerNumber++) {
            if (puzzleNumber == playerNumber) {
                System.out.println("find number =" + playerNumber);
                break;
            } else {
                System.out.println("introduce number < puzzle number   " +  playerNumber);
            }
        }
    }
}