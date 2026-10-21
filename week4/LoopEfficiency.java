package week4;

public class LoopEfficiency {
    public static void main(String[] args) {

        System.out.println("=== ALGORITHM 1: Linear Loop ===");

        int count1 = 0;
        int n = 20;

        for (int i = 0; i < n; i++) {
            count1++;
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count1);
        System.out.println("Time Complexity: O(n)");

        System.out.println("\n=== ALGORITHM 2: Nested Loop (Square) ===");

        int count2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count2++;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count2);
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Formula: n * n = " + (n * n));

        System.out.println("\n=== ALGORITHM 3: Triangular Loop ===");

        int count3 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count3++;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Iterations: " + count3);
        System.out.println("Formula: n * (n + 1) / 2 = "
                + (n * (n + 1) / 2));

        System.out.println("\n=== ALGORITHM 4: Loop with Condition ===");

        int count4 = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count4++;
            }
        }

        System.out.println("n = " + n);
        System.out.println("Even numbers counted: " + count4);
        System.out.println("Total iterations: " + n);
        System.out.println("Time Complexity: O(n)");

        System.out.println("\n=== COMPARISON TABLE ===");
        System.out.println("Algorithm | Iterations | Complexity");
        System.out.println("----------|------------|------------");
        System.out.println("Linear | " + count1 + " | O(n)");
        System.out.println("Nested | " + count2 + " | O(n^2)");
        System.out.println("Triangular | " + count3 + " | O(n^2/2)");
        System.out.println("Condition | " + count4 + " | O(n)");
    }
}