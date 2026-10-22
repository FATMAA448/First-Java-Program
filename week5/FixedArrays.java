public class FixedArrays {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("=== FIXED BUG 1 ===");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== FIXED BUG 2 ===");

        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("\n=== FIXED BUG 3 ===");

        System.out.println("First element: " + numbers[0]);

        System.out.println("\nAll arrays accessed safely!");

    }
}