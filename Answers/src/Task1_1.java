import java.util.ArrayList;
import java.util.Scanner;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1_1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter five variables separated by comma: ");
            String wideString = scan.nextLine();

            String[] camelCaseVariables = new String[5];
            camelCaseVariables = wideString.split(",");

            ArrayList<String> snakeCaseVariables = new ArrayList<>();
            String[] bigLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                    "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

            for (String string : camelCaseVariables) {

                for (int i = 0; i < bigLetters.length; i++) {
                    string = string.replace(bigLetters[i], "_" + bigLetters[i].toLowerCase());
                }
                snakeCaseVariables.add(string);
            }

            for (String string : snakeCaseVariables) {
                System.out.println(string);
            }
        }
    }
}