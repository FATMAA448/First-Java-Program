public class ArrayAlgorithms {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 20, 3, 15, 10};

        System.out.println("=== ARRAY ALGORITHMS ===");

        // Find the sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        // Find the average
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

        // Find the maximum and minimum
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Search for a number
        int target = 20;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        System.out.println("Found " + target + ": " + found);

        // Display the array in reverse
        System.out.println("Array in reverse:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}