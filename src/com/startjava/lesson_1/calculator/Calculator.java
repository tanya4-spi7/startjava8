package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 3;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
        String operation = "+";
        System.out.println();

        if (operation.equals("+")) {
            System.out.println("sum result = " + ( number1 + number2));
        } else if (operation.equals("-")) {
            System.out.println("difference  result = " + (number1 - number2));
        } else if (operation.equals("*")) {
            System.out.println("increase result = " + ( number1 * number2));
        } else if (operation.equals("/")) {
            System.out.println("division result = " + ( number1 / number2));
        } else if (operation.equals("^")) {
            int result = 1;
            for(int i = 1; i <= number2; i++) {
                result *= number1;
            }
            System.out.println("degree  result = " + result);
        } else if (operation.equals("%")) {
            System.out.println("%  result = " + (number1 % number2));
        } else {
            System.out.println("operation  don't support = " + operation);
        }
    }
} 