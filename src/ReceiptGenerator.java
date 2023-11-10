import java.util.Scanner;

public class ReceiptGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemNames = new String[3];
        double subtotal = 0.0;

        double[] itemPrices = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();
            System.out.print("Enter the price of item " + (i + 1) + ": £");
            itemPrices[i] = scanner.nextDouble();
            scanner.nextLine();
            subtotal += itemPrices[i];
        }


        System.out.println("\nNESMART");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Item %d……….£%.2f%n", (i + 1), itemPrices[i]);
        }
        System.out.printf("SUBTOTAL..£%.2f%n", subtotal);


        scanner.close();
    }
}
