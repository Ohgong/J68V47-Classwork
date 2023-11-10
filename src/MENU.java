import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {

            System.out.println("Menu:");
            System.out.println("1. Say 'hello'");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1/2/3/4): ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Hello!");
                    break;
                case "2":
                    System.out.println("Current time is: [TOO hard to do that]");
                    break;
                case "3":
                    System.out.println("Why don't scientists trust atoms? Because they make up everything!");
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1/2/3/4).");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
