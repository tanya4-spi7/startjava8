package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private String operation;

    public Calculator(int number1, String operation, int number2) {
        this.number1 = number1;
        this.operation = operation;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        if (number1 == 0) {
            System.out.println("zero");
        } else {
            this.number1 = number1;
        }
    }

    public int getNumber2() {
        return number2;
    }
    
    public void setNumber2(int number2) {
        if (number2 == 0) {
            System.out.println("zero");
        } else {
            this.number2 = number2;
        }
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        if (operation == "") {
            System.out.println("empty meaning");
        } else {
            this.operation = operation;
        }
    }
    
    public void calculate() {
        switch (operation) {
            case "+":
                System.out.println("sum result = " + (number1 + number2));
                break;
            case "-":
                System.out.println("difference result = " + Math.subtractExact(number1, number2));
                break;
            case "*":
                System.out.println("increase result = " + Math.multiplyExact(number1, number2));
                break;
            case "/":
                System.out.println("division result = " + (number1 / number2));
                break;
            case "^":
                System.out.println("degree  result = " + Math.pow(number1, number2));
                break;
            case "%": 
                System.out.println("%  result = " + (number1 % number2));
                break; 
            default:
                System.out.println("unknown operation = " + operation);
                break;
        }
    }
}