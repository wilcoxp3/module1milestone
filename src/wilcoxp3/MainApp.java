package wilcoxp3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * MainApp contains the main method for a console application in which the user
 * may choose between being greeted by name, dividing integers, or providing a
 * list of words to be alphabetized.
 *
 * @author wilcoxp3
 */
public class MainApp {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {

            System.out.print("1 - Hello, World!\n"
                    + "2 - Integer Divider\n"
                    + "3 - Word Sorter\n"
                    + "4 - Exit\n");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    sayHello();
                    break;
                case 2:
                    divideInt();
                    break;
                case 3:
                    sortWords();
                    break;
                case 4:
                    keepGoing = false;
                    break;
            }
        }
    }

    /**
     * Prompts the user to provide a name, and greets the user by that name.
     */
    private static void sayHello() {

        System.out.print("Please enter your name: ");
        System.out.println("Hello, " + sc.nextLine() + "!");
    }

    /**
     * Prompts the user to provide two integers and displays their quotient and
     * remainder.
     */
    private static void divideInt() {

        int int1;
        int int2;
        int quotient;
        int remainder;

        System.out.println("Let's divide some integers.");
        System.out.print("Enter first integer: ");
        int1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter second integer: ");
        int2 = sc.nextInt();
        sc.nextLine();

        quotient = int1 / int2;
        remainder = int1 % int2;

        System.out.println(int1 + " / " + int2 + " = " + quotient
                + " Remainder " + remainder + "\n");
    }

    /**
     * Prompts the user to provide any number of words and displays the words in
     * alphabetical order.
     */
    private static void sortWords() {

        System.out.println("Let's sort some words.");
        String[] words = new String[0];

        while (true) {

            words = Arrays.copyOf(words, words.length + 1);
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            words[words.length - 1] = word;
            System.out.print("Add another word (y/n)? ");

            if (!sc.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word + "\n");
        }
    }
}
