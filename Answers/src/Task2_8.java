import java.util.Scanner;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task2_8 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String wordsThroughSpaces = scan.nextLine().trim();

            String pretender = "";
            String longWord = "";
            while (pretender.length() != wordsThroughSpaces.length()) {

                if (wordsThroughSpaces.indexOf(' ') != -1) {
                    pretender = wordsThroughSpaces.substring(0, wordsThroughSpaces.indexOf(' '));
                    wordsThroughSpaces = wordsThroughSpaces.substring(wordsThroughSpaces.indexOf(' ') + 1);
                } else {
                    pretender = wordsThroughSpaces;
                    wordsThroughSpaces = "";
                }

                if (pretender.length() > longWord.length()) {
                    longWord = pretender;
                }
            }
            System.out.println("The longest word is: " + longWord);
        }
    }
}