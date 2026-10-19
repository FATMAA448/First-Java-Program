public class LargestArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23};

        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}