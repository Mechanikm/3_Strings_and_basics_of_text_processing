import java.util.Scanner;

// Проверить, является ли заданное слово палиндромом.

public class Task2_3 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter word: ");
            String word = scan.nextLine();

            boolean isPalindrome = true;

            for (int i = 0; i < word.length(); i++) {
           
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            System.out.println("Is your word a palindrome? " + isPalindrome + "!");
        }
    }
}