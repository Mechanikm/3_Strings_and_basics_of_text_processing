import java.util.Scanner;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task2_9 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String littleBigChars = scan.nextLine();

            String littleChars = littleBigChars.toLowerCase();
            String bigChars = littleBigChars.toUpperCase();
            int countLittle = 0;
            int countBig = 0;

            for (int i = 0; i < littleBigChars.length(); i++) {
                if (littleBigChars.charAt(i) != bigChars.charAt(i)
                        && littleBigChars.charAt(i) == littleChars.charAt(i)) {
                    countLittle++;
                }
                if (littleBigChars.charAt(i) != littleChars.charAt(i)
                        && littleBigChars.charAt(i) == bigChars.charAt(i)) {
                    countBig++;
                }
            }

            System.out.println("Lowercase letters: " + countLittle);
            System.out.println("Uppercase letters: " + countBig);
        }
    }
}