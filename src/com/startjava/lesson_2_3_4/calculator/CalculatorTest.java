package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String continuation;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("enter the expression");
            String nOperationN = scan.nextLine();
            String[] arrOfNOperationN = nOperationN.split(" ");

            int number1 = Integer.parseInt(arrOfNOperationN[0]);
            int number2 = Integer.parseInt(arrOfNOperationN[2]);
            String operation = arrOfNOperationN[1];

            System.out.println("First number = " + number1);
            System.out.println("Operation = " + operation);
            System.out.println("Second number = " + number2);
            System.out.println("expression = " + nOperationN);

            Calculator myCalc = new Calculator();
            myCalc.setNumber1(number1);
            myCalc.setNumber2(number2);
            myCalc.setOperation(operation);

            myCalc.calculate();
            do {
                System.out.println("I would like continue yes/no");
                continuation = scan.nextLine();
                if (continuation.equals("yes")) {
                    System.out.println("continuation = " + continuation);
                    break;
                } else if (continuation.equals("no")) {
                    break;
                } else {
                    System.out.println("continuation = " + continuation + "  you must enter yes or no");
                }
            } while ((continuation != "yes") & (continuation != "no"));

        } while (continuation.equals("yes"));
    }
}