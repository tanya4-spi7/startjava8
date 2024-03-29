package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int puzzleNumber;
    private int attempt;
    private Player player1;
    private Player player2;
    private  boolean isWin;
    private int i;

    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(101);
        System.out.println("puzzleNumber = " + puzzleNumber);
            for (i = 0; i < 10; i++) {
                isWin = false;
                inputNumber(player1);
                compareNumbers(player1);
                if (isWin == true) {
                    outputGuess(player1);
                    cleaningGuess(player1);
                    break;
                }
                inputNumber(player2);
                compareNumbers(player2);
                if (isWin == true) {
                    outputGuess(player2);
                    cleaningGuess(player2);
                    break;
                }
                guessFinishGame(player1);
                if (i == 9) {
                    if (isWin == false) {
                        outputGuess(player1);
                        cleaningGuess(player1);
                    }
                }
                guessFinishGame(player2);
                if (i == 9) {
                    if (isWin == false) {
                        outputGuess(player2);
                        cleaningGuess(player2);
                        break;
                    }
                }
            }
    }

    public void inputNumber(Player player) {
        System.out.println(player.getName());
        System.out.println("Enter the number");
        player.setNumber(scan.nextInt());
        System.out.println("number = " + player.getNumber());
      //  player.setGuesses(guesses);
        player.setGuesses(player.getGuesses())[i] = player.getNumber();
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

    public void guessFinishGame(Player player) {
        if (i == 9) {
            if (isWin == false) {
                System.out.println("У " + player.getName() + " закончились попытки");
                attempt = 10;
                player.getAttempts(attempt);
            }
        }
    }

    public void outputGuess(Player player) {
        System.out.println("guessesCopy: " + Arrays.toString(player.getGuessesCopy()));
    }

    public static void cleaningGuess(Player player) {
        Arrays.fill(player.setGuesses(player.getGuesses()), 0);
    }

}

