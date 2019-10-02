package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int puzzleNumber;
    int attempt;
    private Player player1;
    private Player player2;
    public boolean isWin;
    int i;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(101);
        System.out.println("puzzleNumber = " + puzzleNumber);
        do {
            for (i = 0; i < 10; i++) {
                isWin = false;
                inputNumber(player1);
                compareNumbers(player1);
                if (isWin == true) {
                    arrayOutput(player1);
                    arrayCleaning(player1);
                    break;
                }
                inputNumber(player2);
                compareNumbers(player2);
                if (isWin == true) {
                    arrayOutput(player2);
                    arrayCleaning(player2);
                    break;
                }
                guessEndGame(player1);
                if (i == 9) {
                    if (isWin == false) {
                        arrayOutput(player1);
                        arrayCleaning(player1);
                    }
                }
                guessEndGame(player2);
                if (i == 9) {
                    if (isWin == false) {
                        arrayOutput(player2);
                        arrayCleaning(player2);
                        break;
                    }
                }
            }
            break;
        }
        //  while ((puzzleNumber != player1.getNumber()) && (puzzleNumber != player2.getNumber()));
        while (true);
    }

    public void inputNumber(Player player) {
        System.out.println(player.getName());
        System.out.println("Enter the number");
        player.setNumber(scan.nextInt());
        System.out.println("number = " + player.getNumber());
        player.guesses[i] = player.getNumber();
    }

    public void compareNumbers(Player player) {
        if (puzzleNumber == player.getNumber()) {
            System.out.println("find number = " + player.getNumber());
            attempt = i + 1;
            isWin = true;
            System.out.println("игрок " + player.getName() + " угадал число " + puzzleNumber + " с " + attempt + " попытки");
            player.getAttempts(attempt);
        } else if (puzzleNumber > player.getNumber()) {
            System.out.println("number < puzzleNumber");
        } else if (puzzleNumber < player.getNumber()) {
            System.out.println("number > puzzleNumber");
        }
    }

    public void guessEndGame(Player player) {
        if (i == 9) {
            if (isWin == false) {
                System.out.println("У " + player.getName() + " закончились попытки");
                attempt = 10;
                player.getAttempts(attempt);
            }
        }
    }

    public void arrayOutput(Player player) {
        System.out.println("guessesCopy: " + Arrays.toString(player.guessesCopy));
    }

    public void arrayCleaning(Player player) {
        Arrays.fill(player.guesses, 0);
    }
}

