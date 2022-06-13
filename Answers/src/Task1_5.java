import java.util.ArrayList;
import java.util.Scanner;

// Удалить в строке все лишние пробелы, 
// то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task1_5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string with extra spaces: ");
            String stringWithSpaces = scan.nextLine();
            String[] arrayWithSpaces = stringWithSpaces.trim().split(" ");

            String stringWithoutExtraSpaces;
            ArrayList<String> arrayWithoutExtraSpaces = new ArrayList<String>();

            arrayWithoutExtraSpaces.add(arrayWithSpaces[0]);

            for (int i = 1; i < arrayWithSpaces.length; i++) {
                if (arrayWithSpaces[i] != " " && arrayWithSpaces[i] != "") {
                    arrayWithoutExtraSpaces.add(" ");
                    arrayWithoutExtraSpaces.add(arrayWithSpaces[i]);
                }
            }
            stringWithoutExtraSpaces = String.join("", arrayWithoutExtraSpaces);

            System.out.println("There is a string without extra spaces:");
            System.out.println(stringWithoutExtraSpaces);
        }
    }
}