import java.util.Scanner;

public class MATHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Math Quiz Game!");

        for (int i = 1; i <= 10; i++) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            // Generate a random operator (+, -, *)
            String[] operators = {"+", "-", "*"};
            int operatorIndex = (int) (Math.random() * operators.length);
            String operator = operators[operatorIndex];

            System.out.print("Question " + i + ": What is " + num1 + " " + operator + " " + num2 + "? ");
            int userAnswer = scanner.nextInt();

            int correctAnswer;
            switch (operator) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                default:
                    correctAnswer = 0;
            }

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("Quiz completed! Your score is: " + score + "/10");
        scanner.close();
    }
}
