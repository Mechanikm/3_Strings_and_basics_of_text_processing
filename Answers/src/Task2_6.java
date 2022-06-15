import java.util.Scanner;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task2_6 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String singleLetterString = scan.nextLine();

            String doubleLetterString = "";

            for (int i = 0; i < singleLetterString.length(); i++) {
                doubleLetterString = doubleLetterString + singleLetterString.charAt(i) + singleLetterString.charAt(i);
            }
            System.out.println("The new string is: " + doubleLetterString);
        }
    }
}