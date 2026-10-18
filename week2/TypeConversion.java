public class TypeConversion {
    public static void main(String[] args) {

        // Widening conversion: int to double
        int wholeNumber = 100;
        double decimalNumber = wholeNumber;

        System.out.println("=== WIDENING CONVERSION ===");
        System.out.println("Integer value: " + wholeNumber);
        System.out.println("Double value: " + decimalNumber);

        // Narrowing conversion: double to int
        double price = 99.99;
        int roundedPrice = (int) price;

        System.out.println("\n=== NARROWING CONVERSION ===");
        System.out.println("Original price: " + price);
        System.out.println("Converted price: " + roundedPrice);

        // Converting String to int
        String ageText = "19";
        int age = Integer.parseInt(ageText);

        System.out.println("\n=== STRING CONVERSION ===");
        System.out.println("Age as String: " + ageText);
        System.out.println("Age as int: " + age);

        // Converting int to String
        int marks = 85;
        String marksText = String.valueOf(marks);

        System.out.println("Marks as int: " + marks);
        System.out.println("Marks as String: " + marksText);
    }
}