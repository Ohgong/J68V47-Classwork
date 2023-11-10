import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number for the times table: ");
        int baseNumber = scanner.nextInt();

        System.out.println("Times Table for " + baseNumber + ":");
        for (int i = 1; i <= 12; i++) {
            int result = baseNumber * i;
            System.out.println(baseNumber + " x " + i + " = " + result);
        }

        scanner.close();
    }
}


