package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger  phoenix = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.7f, 2.1f, 3, 8, 9);

        System.out.println(phoenix.getModelName());
        System.out.println(phoenix.getMark());
        System.out.println(phoenix.getOrigin());
        System.out.println(phoenix.getHeight());
        System.out.println(phoenix.getWeight());
        System.out.println(phoenix.getSpeed());
        System.out.println(phoenix.getStrength());
        System.out.println(phoenix.getArmor());

        System.out.println(phoenix.drift());
        phoenix.move();
        System.out.println(phoenix.scanKaiju());
        phoenix.useVortexCannon();

        Jaeger  tramp = new Jaeger("Tramp", "Mark-5", "USA", 80.7f, 2.2f, 4, 8, 9);

        System.out.println(tramp.getModelName());
        System.out.println(tramp.getMark());
        System.out.println(tramp.getOrigin());
        System.out.println(tramp.getHeight());
        System.out.println(tramp.getWeight());
        System.out.println(tramp.getSpeed());
        System.out.println(tramp.getStrength());
        System.out.println(tramp.getArmor());

        System.out.println(tramp.drift());
        tramp.move();
        System.out.println(tramp.scanKaiju());
    }
}