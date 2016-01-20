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

            System.out.print("1 - Hello, World!\n"
                    + "2 - Integer Divider\n"
                    + "3 - Word Sorter\n"
                    + "4 - Exit\n");

            int choice = SC.nextInt();
            SC.nextLine();

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

    private static void sayHello() {

        System.out.print("Please enter your name: ");
        String name = SC.nextLine();
        System.out.println("Hello, " + name + "!");

    }

    private static void divideInt() {

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
                + " Remainder " + remainder + "\n");
    }

    private static void sortWords() {

        System.out.println("Let's sort some words.");

        int wordCount = 0;
        String[] words = new String[0];

        while (true) {

            words = Arrays.copyOf(words, words.length + 1);

            System.out.print("Enter a word: ");
            String word = SC.nextLine();
            wordCount++;
            words[wordCount - 1] = word;

            System.out.print("Add another word (y/n)? ");

            String answer = SC.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        Arrays.sort(words);

        for (String word : words) {
            System.out.print(word + "\n");
        }
    }

}
