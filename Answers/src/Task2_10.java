import java.util.Scanner;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой, 
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.

public class Task2_10 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String fewSentences = scan.nextLine();

            long countDot = fewSentences.codePoints().filter(sign -> sign == '.').count();
            long countExclamation = fewSentences.codePoints().filter(sign -> sign == '!').count();
            long countQuestion = fewSentences.codePoints().filter(sign -> sign == '?').count();

            System.out.println("There is " + (countDot + countExclamation + countQuestion) + " sentences");
        }
    }
}