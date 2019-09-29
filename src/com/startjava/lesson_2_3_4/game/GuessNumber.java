package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int puzzleNumber;
    int  j;
    private Player player1;
    private Player player2;
    int flag = 1;
    int i;

    Scanner scan = new Scanner(System.in); 
    public GuessNumber(Player player1, Player player2 ) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void onePlayer(Player player) {
        System.out.println(player.getName());
        System.out.println("Enter the number");
        player.setNumber(scan.nextInt());
        System.out.println("number = " + player.getNumber());
        player.guess[i] = player.getNumber();
        if (puzzleNumber == player.getNumber()) {
            System.out.println("find number = " + player.getNumber());
            j = i + 1;
            flag = 2;
            System.out.println("игрок " + player.getName() + " угадал число " + puzzleNumber + " с " + j + " попытки");
            player.getAttempts(j);
        } else if (puzzleNumber > player.getNumber()) {
            System.out.println("number < puzzleNumber");
        } else if (puzzleNumber < player.getNumber()) {
            System.out.println("number > puzzleNumber");
        }
    }
    public void playEnd (Player player) {
        if (i == 9) {
            if (flag == 1) {
                System.out.println("У " + player.getName() + " закончились попытки");
                j=10;
                player.getAttempts(j);
            }
        }
    }

//    public void playEndLast (Player player) {
//        if (i == 9) {
//            if (flag == 1) {
//                System.out.println("У " + player.getName() + " закончились попытки");
//                j=10;
//                player.getAttempts(j);
//            }
//        }
//    }

    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(101);
        System.out.println("puzzleNumber = " + puzzleNumber);
        do {
            for( i=0; i < 10; i++) {
                flag = 1;
                onePlayer(player1);
                if  (flag == 2 ) {
                    break;
                }
                onePlayer(player2);
                if  (flag == 2 ) {
                    break;
                }
                playEnd (player1);
                playEnd (player2);
                if (i == 9) {
                    if (flag == 1) {
                        break;
                    }
                }
            }
        }
        while ((puzzleNumber != player1.getNumber()) && (puzzleNumber != player2.getNumber()));
     //   while(true);
    }
}

