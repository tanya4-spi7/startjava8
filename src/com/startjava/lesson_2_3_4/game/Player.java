package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    int[] guess = new int[10];
    int k;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("empty meaning");
        } else {
            this.name = name;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number == 0) {
            System.out.println("zero");
        } else {
            this.number = number;
        }
    }
    public void arrCopyOf() {
        for (int i = 0; i < 10; i++) {
            if (guess[i] != 0) {
                int k = i + 1;
                System.out.println(guess[i]);
                System.out.println(k);
            }
        }
        int[] guessCopy = Arrays.copyOf(guess,k);
//        for (int i = 0; i < 10; i++) {
//            if (guessCopy[i] != 0) {
//                int j = i + 1;
//                System.out.println(guessCopy[i]);
//                System.out.println(j);
//            }
//        }
        System.out.println("guessCopy: " + Arrays.toString(guessCopy));
        //Arrays.fill(guess, 0);
    }
}