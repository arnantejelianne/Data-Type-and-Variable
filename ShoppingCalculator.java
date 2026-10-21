public class ShoppingCalculator {
public static void main(String[] args) {

    String storeName = "Shop Smart";
    int quantity = 4;
    double unitPrice = 125.50;

    double totalCost = quantity + unitPrice;


    System.out.println("=== SHOPPING RECEIPT===");
    System.out.println("Store Name : " + storeName);
    System.out.println("Quantity : " + quantity);
    System.out.println("Unit Price: ₱" + unitPrice);
    System.out.println("Total Cost: ₱" + totalCost);
    }
}
