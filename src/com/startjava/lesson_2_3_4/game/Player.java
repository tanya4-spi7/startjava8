package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    int[] guess = new int[10];
    int j;

    public Player(int j) {
        this.j = j;
    }

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

    public void getAttempts(j) {

        int[] guessCopy = Arrays.copyOf(guess,j);

        System.out.println("guessCopy: " + Arrays.toString(guessCopy));
        //Arrays.fill(guess, 0);
    }
}