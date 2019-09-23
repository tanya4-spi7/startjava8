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
    Scanner scan = new Scanner(System.in); 
    public GuessNumber(Player player1, Player player2 ) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void play() {
        Random random = new Random();
        puzzleNumber = random.nextInt(101);
        System.out.println("puzzleNumber = " + puzzleNumber);
        do {
            for(int i=0; i < 10; i++) {
                flag = 1;
                System.out.println(player1.getName());
                System.out.println("Enter the number");
                player1.setNumber(scan.nextInt());
                System.out.println("number = " + player1.getNumber());
                player1.guess[i] = player1.getNumber();
                if (puzzleNumber == player1.getNumber()) {
                    System.out.println("find number = " + player1.getNumber());
                    j = i+1;
                    flag = 2;
                    System.out.println("игрок " + player1.getName() + " угадал число " + puzzleNumber +" с " + j + " попытки");
//                    int[] guessCopy = Arrays.copyOf(player1.guess,j);
//                    System.out.println("guessCopy: " + Arrays.toString(guessCopy));
//                    int[] guess1Copy = Arrays.copyOf(player2.guess,i);
//                    System.out.println("guess1Copy: " + Arrays.toString(guess1Copy));
//                    Arrays.fill(player1.guess, 0);
//                    Arrays.fill(player2.guess, 0);
//                    Arrays.fill(guessCopy, 0);
//                    Arrays.fill(guess1Copy, 0);
                    break;
                } else if (puzzleNumber > player1.getNumber()) {
                    System.out.println("number < puzzleNumber");
                } else if (puzzleNumber < player1.getNumber()) {
                    System.out.println("number > puzzleNumber");
                }
                System.out.println(player2.getName());
                System.out.println("Enter the number");
                player2.setNumber(scan.nextInt());
                System.out.println("number = " + player2.getNumber());
                player2.guess[i] = player2.getNumber();
                if (puzzleNumber == player2.getNumber()) {
                    System.out.println("find number = " + player2.getNumber());
                    j = i+1;
                    flag = 2;
                    System.out.println("игрок " + player2.getName() + " угадал число " + puzzleNumber +" с " + j + " попытки");
//                    int[] guessCopy = Arrays.copyOf(player1.guess,j);
//                    System.out.println("guessCopy: " + Arrays.toString(guessCopy));
//                    int[] guess1Copy = Arrays.copyOf(player2.guess,j);
//                    System.out.println("guess1Copy: " + Arrays.toString(guess1Copy));
//                    Arrays.fill(player1.guess, 0);
//                    Arrays.fill(player2.guess, 0);
//                    Arrays.fill(guessCopy, 0);
//                    Arrays.fill(guess1Copy, 0);
                    break;
                } else if (puzzleNumber > player2.getNumber()) {
                    System.out.println("number < puzzleNumber");
                } else if (puzzleNumber < player2.getNumber()) {
                    System.out.println("number > puzzleNumber");
                }
                if (i == 9) {
                    if (flag == 1) {
                        System.out.println("У " + player1.getName() + " закончились попытки");
//                        System.out.println(player1.guess[0] + " " + player1.guess[1] + " " + player1.guess[2] + " " + player1.guess[3] + " " + player1.guess[4]);
//                        System.out.println(player1.guess[5] + " " + player1.guess[6] + " " + player1.guess[7] + " " + player1.guess[8] + " " + player1.guess[9]);
                        System.out.println("У " + player2.getName() + " закончились попытки");
//                        System.out.println(player2.guess[0] + " " + player2.guess[1] + " " + player2.guess[2] + " " + player2.guess[3] + " " + player2.guess[4]);
//                        System.out.println(player2.guess[5] + " " + player2.guess[6] + " " + player2.guess[7] + " " + player2.guess[8] + " " + player2.guess[9]);
//                        Arrays.fill(player1.guess, 0);
//                        Arrays.fill(player2.guess, 0);
                    }
                    break;
                }
            }
        }
        while ((puzzleNumber != player1.getNumber()) && (puzzleNumber != player2.getNumber()));
     //   while(true);

//        if (flag == 1) {
//            System.out.println("У" + player1.getName() + "закончились попытки");
//            System.out.println(player1.guess1[0] + " " + player1.guess1[1] + " " + player1.guess1[2] + " " + player1.guess1[3] + " " + player1.guess1[4]);
//            System.out.println(player1.guess1[5] + " " + player1.guess1[6] + " " + player1.guess1[7] + " " + player1.guess1[8] + " " + player1.guess1[9]);
//            System.out.println("У" + player2.getName() + "закончились попытки");
//            System.out.println(player2.guess2[0] + " " + player2.guess2[1] + " " + player2.guess2[2] + " " + player2.guess2[3] + " " + player2.guess2[4]);
//            System.out.println(player2.guess2[5] + " " + player2.guess2[6] + " " + player2.guess2[7] + " " + player2.guess2[8] + " " + player2.guess2[9]);
//        }
    }
}

