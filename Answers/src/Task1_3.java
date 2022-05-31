import java.util.Scanner;

// В строке найти количество цифр.

public class Task1_3 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter string for checking: ");
            String stringWithDigits = scan.nextLine();

            long color = stringWithDigits.codePoints().filter(Character::isDigit).count();
            
            if (color > 0) {
                System.out.println("There is " + color + " digits");
            } else {
                System.out.println("There isn't any digit");
            }
        }
    }
}