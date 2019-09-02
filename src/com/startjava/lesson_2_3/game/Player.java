package com.startjava.lesson_2_3.game;

public class Player {
    private String name;
    private int number;
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
}