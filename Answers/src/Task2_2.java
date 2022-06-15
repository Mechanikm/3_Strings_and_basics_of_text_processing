import java.util.Scanner;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2_2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String stringWithA = scan.nextLine();

            String stringWithAB = "";

            for (int i = 0; i < stringWithA.length(); i++) {
            stringWithAB += stringWithA.charAt(i);
                if (stringWithA.charAt(i) == 'a') {
                    stringWithAB += 'b';
                }
            }
            System.out.println("Here is your new string: " + stringWithAB);
        }
    }
}