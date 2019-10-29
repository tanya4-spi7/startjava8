package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] guessesCopy;
    private int[] guesses = new int[10];

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

    public void getAttempts(int attempt) {
        int[] guessesCopy = Arrays.copyOf(guesses, attempt);
     //   System.out.println("guessesCopy: " + Arrays.toString(guessesCopy));
    }

    public int[] getGuessesCopy() {
        return guessesCopy;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void setGuesses() {
        if (guesses[0] == 0) {
            System.out.println("zero");
        } else {
            this.guesses = guesses;
        }
    }
}