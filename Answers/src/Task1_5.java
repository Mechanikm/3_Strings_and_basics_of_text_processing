import java.util.Scanner;

// Удалить в строке все лишние пробелы, 
// то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task1_5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string with extra spaces: ");
            String stringWithSpaces = scan.nextLine();
            stringWithSpaces = stringWithSpaces.trim();

            while (stringWithSpaces.contains("  ")) {
                String replace = stringWithSpaces.replace("  ", " ");
                stringWithSpaces = replace;
            }

            System.out.println("There is a string without extra spaces:");
            System.out.print(stringWithSpaces);
        }
    }
}