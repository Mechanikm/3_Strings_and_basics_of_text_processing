import java.util.Scanner;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task1_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string for replacing: ");
            String wordToLetter = scan.nextLine();

           String withoutWord = wordToLetter.replace("word", "letter");

            System.out.println(withoutWord);
        }
    }
}