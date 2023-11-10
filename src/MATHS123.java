import java.util.Scanner;

public class MATHS123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Math Quiz Game!");

        String difficulty;
        do {
            System.out.println("Choose the difficulty level:");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1/2/3/4): ");
            difficulty = scanner.nextLine();

            switch (difficulty) {
                case "1":
                    runMathQuiz(3);
                    break;
                case "2":
                    runMathQuiz(2);
                    break;
                case "3":
                    runMathQuiz(1);
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1/2/3/4).");
            }
        } while (!difficulty.equals("4"));

        scanner.close();
    }

    public static void runMathQuiz(int lives) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 1; i <= 10; i++) {
            if (lives == 0) {
                System.out.println("You've run out of lives. Quiz ends!");
                break;
            }

            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

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
                lives--;
            }
        }

        if (lives > 0) {
            System.out.println("Quiz completed! Your score is: " + score + "/10");
            System.out.println("Well done!");
        } else {
            System.out.println("Quiz completed! Your score is: " + score + "/10");
        }

        scanner.close();
    }
}
