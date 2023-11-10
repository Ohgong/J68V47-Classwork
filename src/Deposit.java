import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your surname: ");
        String surname = input.nextLine();

        System.out.print("Enter the total value of your order: ");
        double totalOrderValue = input.nextDouble();

        System.out.print("Enter the amount you wish to pay as a deposit: ");
        double depositAmount = input.nextDouble();

        double remainingAmount = totalOrderValue - depositAmount;

        boolean qualifiesForToaster = totalOrderValue >= 200.0 && depositAmount >= 100.0;

        System.out.println("\nReceipt:");
        System.out.println("Name: " + firstName.charAt(0) + ". " + surname);
        System.out.println("Total Order Value: $" + totalOrderValue);
        System.out.println("Deposit Amount: $" + depositAmount);
        System.out.println("Remaining Amount to be Paid: $" + remainingAmount);

        if (qualifiesForToaster) {
            System.out.println("Congratulations! You qualify for a free toaster.");
        } else {
            System.out.println("Sorry, you do not qualify for a free toaster.");
        }
        input.close();
    }
}
