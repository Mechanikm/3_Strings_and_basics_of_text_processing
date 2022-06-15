import java.util.Scanner;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task2_1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string with spaces: ");
            String stringWithSpaces = scan.nextLine();

            int maxSpacesPretender = 0;
            int maxSpaces = 0;

            for (int i = 0; i < stringWithSpaces.length(); i++) {
                if (stringWithSpaces.charAt(i) == ' ') {
                    maxSpacesPretender++;
                } else {
                    maxSpacesPretender = 0;
                }

                    if (maxSpacesPretender > maxSpaces) {
                        maxSpaces = maxSpacesPretender;
                    }
            }
            System.out.println("Max quantity of spaces: " + maxSpaces);
        }
    }
}