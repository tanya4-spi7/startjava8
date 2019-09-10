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
            for (String a:arrOfNOperationN)
                System.out.println(a);
            String part1 = arrOfNOperationN[0];
            String part2 = arrOfNOperationN[1];
            String part3 = arrOfNOperationN[2];
            int number1 = Integer.parseInt(part1);
            int number2 = Integer.parseInt(part3);
            String operation = part2;

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