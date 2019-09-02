package com.startjava.lesson_2_3.game;
//package com.journaldev.examples;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String continuation;
        Scanner scan = new Scanner(System.in); 
        do {
            System.out.println("Enter the first name1");
            String name1 = scan.next();
            Player player1 = new Player(name1);
            System.out.println("Enter the second name2");
            String name2 = scan.next();
            Player player2 = new Player(name2);
            GuessNumber myGame = new GuessNumber(player1, player2);
            myGame.play();
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
            } while ((continuation != "yes") && (continuation != "no"));
        } while (continuation.equals("yes"));
    }
}