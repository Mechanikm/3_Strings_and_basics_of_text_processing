import java.util.Scanner;

// В строке найти количество чисел.

public class Task1_4 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string for replacing: ");
            String stringWithNumbers = scan.nextLine();

            char[] arrayWithNumbers = stringWithNumbers.toCharArray();
            int countNumbers = 0;

            for (int i = 0; i < arrayWithNumbers.length; i++) {
                if (i == arrayWithNumbers.length - 1 && (Character.isDigit(arrayWithNumbers[i]))
                        || (Character.isDigit(arrayWithNumbers[i]) && !Character.isDigit(arrayWithNumbers[i + 1]))) {
                    countNumbers++;
                }
            }

            System.out.println("There is " + countNumbers + " number[s]");
        }
    }
}