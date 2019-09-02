package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName1, String mark1, String origin1, float height1, float weight1, int speed1, int strength1, int armor1) {
        modelName = modelName1;
        mark = mark1;
        origin = origin1;
        height = height1;
        weight = weight1;
        speed = speed1;
        strength = strength1;
        armor = armor1;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName.equals("")) {
            System.out.println("empty meaning");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark.equals("")) {
            System.out.println("empty meaning");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if (origin.equals("")) {
            System.out.println("empty meaning");
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height == 0) {
            System.out.println("zero");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight == 0) {
            System.out.println("zero");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == 0) {
            System.out.println("zero");
        } else {
            this.speed = speed;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength == 0) {
            System.out.println("zero");
        } else {
            this.strength = strength;
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor == 0) {
            System.out.println("zero");
        } else {
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("You came in drift");
        return true;
    }

    public void move() {
        System.out.println("You went five steps");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {

    }
}