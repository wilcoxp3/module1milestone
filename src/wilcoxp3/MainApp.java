/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilcoxp3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wilcoxp3
 */
public class MainApp {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        boolean keepGoing = true;
        while (keepGoing) {

            printMenu();
            int choice = SC.nextInt();
            SC.nextLine();

            switch (choice) {

                case 1:
                    runHelloWorld();
                    break;
                case 2:
                    runIntDivider();
                    break;
                case 3:
                    runWordSorter();
                    break;
                case 4:
                    keepGoing = false;
                    break;
            }
        }

    }

    private static void printMenu() {

        System.out.print("1 - Hello, World!\n2 - Integer Divider\n"
                + "3 - Word Sorter\n4 - Exit\n");
    }

    private static void runHelloWorld() {

        System.out.print("Please enter your name: ");
        String name = SC.nextLine();
        System.out.println("Hello, " + name + "!");

    }

    private static void runIntDivider() {

        int int1;
        int int2;
        int quotient;
        int remainder;

        System.out.println("Let's divide some integers.");

        System.out.print("Enter first integer: ");
        int1 = SC.nextInt();
        SC.nextLine();
        System.out.print("Enter second integer: ");
        int2 = SC.nextInt();
        SC.nextLine();

        quotient = int1 / int2;
        remainder = int1 % int2;

        System.out.println(int1 + " / " + int2 + " = " + quotient
                + " remainder " + remainder + "\n");
    }

    private static void runWordSorter() {

        System.out.println("Let's sort some words.");

        int numOfWords = 0;
        String[] words = new String[1];
        // boolean keepGoing = true;

        while (true) {

            System.out.print("Enter a word: ");
            String word = SC.nextLine();
            words[numOfWords] = word;
            numOfWords++;

            System.out.print("Add another word (y/n)? ");

            String answer = SC.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }

            if (words.length == numOfWords) {
                words = Arrays.copyOf(words, words.length + 1);
            }
        }

        Arrays.sort(words);

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

}
