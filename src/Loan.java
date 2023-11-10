import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the loan: $");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (APR): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;

        int numberOfPayments = numberOfYears * 12;

        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)));

        System.out.println("Monthly Payment: $" + monthlyPayment);

        scanner.close();
    }
}
