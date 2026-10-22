public class ArrayIndexDebug {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("=== BUG 1 ===");

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== BUG 2 ===");

        System.out.println("Last element: " + numbers[numbers.length]);

        System.out.println("\n=== BUG 3 ===");

        System.out.println("First element: " + numbers[1]);

    }
}