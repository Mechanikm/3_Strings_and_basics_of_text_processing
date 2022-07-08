import java.util.Scanner;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class Task2_7 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String repeatedChars = scan.nextLine().replace(" ", "");

            String withoutRepeatedChars = "";

            while (repeatedChars.length() > 0) {
                withoutRepeatedChars = withoutRepeatedChars + repeatedChars.charAt(0);
                repeatedChars = repeatedChars.replace(Character.toString(repeatedChars.charAt(0)), "");
            }
            System.out.println("The new string is: " + withoutRepeatedChars);
        }
    }
}