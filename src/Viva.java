
import java.util.Scanner;

public class Viva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] questions = {
                "What is the capital of Spain?",
                "What is the largest planet in our solar system?",
                "Which gas do plants absorb from the atmosphere during photosynthesis?"
        };

        String[] answers = {
                "madrid",
                "jupiter",
                "carbon dioxide"
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();
            boolean isCorrect = false;


            for (String correctAnswer : answers) {
                if (userAnswer.equals(correctAnswer)) {
                    isCorrect = true;
                    break;
                }
            }


            System.out.println("Your answer is " + (isCorrect ? "True" : "False") + "\n");
        }

        scanner.close();
    }

}
