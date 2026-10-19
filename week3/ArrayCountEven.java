public class ArrayCountEven {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14, 17};
        int count = 0;

        for (int n : numbers) {
            if (n % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers: " + count);
    }
}