import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your year of birth (e.g. 1999): ");
        int yearOfBirth = scanner.nextInt();

        scanner.close();


        String username = firstName.substring(0, 1).toLowerCase() + surname.toLowerCase();
        System.out.println("Username: " + username);


        String password = surname.substring(0, 1).toLowerCase() +
                firstName.substring(0, 3).toUpperCase() +
                yearOfBirth;
        System.out.println("Password: " + password);


    }
}
