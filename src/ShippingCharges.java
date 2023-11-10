
import java.util.Scanner;

public class ShippingCharges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount (£): ");
        double totalPurchaseAmount = scanner.nextDouble();

        double shippingCost = (totalPurchaseAmount < 50.0) ? 10.0 : 0.0;
        double finalTotal = totalPurchaseAmount + shippingCost;

        System.out.printf("Total Purchase Amount: £%.2f\n", totalPurchaseAmount);
        System.out.printf("Shipping Cost: £%.2f\n", shippingCost);
        System.out.printf("Final Total (including shipping): £%.2f\n", finalTotal);

        scanner.close();
    }
}

