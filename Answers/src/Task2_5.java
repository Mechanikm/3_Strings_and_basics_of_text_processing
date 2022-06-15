import java.util.Scanner;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task2_5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string with 'a': ");
            String stringWithLetter = scan.nextLine();

            String letterForCount = "a";

            int count = stringWithLetter.replaceAll("[^" + letterForCount + "]", "").length() / letterForCount.length();
            if (count != 0) {
                System.out.println("This string contains " + count + " letters '" + letterForCount + "'");
            } else {
                System.out.println("There is not any letter '" + letterForCount + "'");
            }
        }
    }
}