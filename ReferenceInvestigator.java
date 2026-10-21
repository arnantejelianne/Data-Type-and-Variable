public class ReferenceInvestigator {
    public static void main(String[] args) {
        System.out.println("=== PRIMITIVE OVERFLOW DEMO ===");
        short maxShortValue = 32767;
        System.out.println("Initial short value : " + maxShortValue);

        maxShortValue++;
        System.out.println("Value after increment: " + maxShortValue + " (Wrapped around to -32768)\n");

        System.out.println("=== STRING REFERENCE COMPARISONS ===");
        String firstText = new String("Programming");
        String secondText = new String("Programming");
        String thirdText = "Programming";

        boolean check1 = (firstText == secondText);
        boolean check2 = firstText.equals(secondText);

        boolean check3 = (firstText == thirdText);
        boolean check4 = firstText.equals(thirdText);

        boolean check5 = (secondText == thirdText);
        boolean check6 = secondText.equals(thirdText);

        System.out.println("firstText == secondText      : " + check1);
        System.out.println("firstText.equals(secondText) : " + check2);
        System.out.println("firstText == thirdText       : " + check3);
        System.out.println("firstText.equals(thirdText)  : " + check4);
        System.out.println("secondText == thirdText      : " + check5);
        System.out.println("secondText.equals(thirdText) : " + check6 + "\n");

        System.out.println("=== SHARED ARRAY REFERENCE DEMO ===");
        int[] scores = {85, 90, 95};

        int[] sharedScores = scores;

        System.out.println("Original scores array : " + java.util.Arrays.toString(scores));
        System.out.println("Shared scores array   : " + java.util.Arrays.toString(sharedScores));

        sharedScores[1] = 100;

        System.out.println("\n-- After updating sharedScores[1] = 100 --");
        System.out.println("Original scores array (updated) : " + java.util.Arrays.toString(scores));
        System.out.println("Shared scores array             : " + java.util.Arrays.toString(sharedScores));
    }
}
