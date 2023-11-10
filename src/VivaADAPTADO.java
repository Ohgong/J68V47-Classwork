import java.util.Scanner;

public class VivaADAPTADO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of Spain?",
                "What is the largest planet in our solar system?",
                "Which gas do plants absorb from the atmosphere during photosynthesis?"
        };

        String[] answers = {
                "Madrid",
                "Jupiter",
                "Carbon dioxide"
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Sorry, the correct answer is " + answers[i] + ".\n");
            }
        }

        scanner.close();
    }
}