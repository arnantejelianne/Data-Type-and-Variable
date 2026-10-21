public class UnitCastingConverter {
    public static void main(String[] args) {

      double userDistanceCm = 638.92;

        int meters = (int) (userDistanceCm / 100);
        double extraCentimeters = userDistanceCm % 100;

        System.out.println("=== DISTANCE CONVERTER ===");
        System.out.println("Input Distance: " + userDistanceCm+"cm");
        System.out.println("Converted : + meters + m and " + extraCentimeters + " cm\n");

        int itemCount = 8;
        double floatingItemCount = itemCount;

        System.out.println("--- Implicit Widening Demo ---");
        System.out.println("Original int value  : " + itemCount);
        System.out.println("Promoted double value: " + floatingItemCount + "\n");

        double speedLimit = 88.65;
        int speedLimitwhole = (int) speedLimit;
        
        System.out.println("--- Explicit Narrowing Demo ---");
        System.out.println("Original double value: " + speedLimit);
        System.out.println("Narrowed int value: " + speedLimitwhole);
       }
}
