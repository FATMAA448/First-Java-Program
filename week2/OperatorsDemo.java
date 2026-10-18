public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum (a + b): " + sum);
        System.out.println("Difference (a - b): " + difference);
        System.out.println("Product (a * b): " + product);
        System.out.println("Quotient (a / b): " + quotient);
        System.out.println("Remainder (a % b): " + remainder);

        int precedence1 = 10 + 5 * 2;
        int precedence2 = (10 + 5) * 2;
        int precedence3 = 20 % 3 + 4 * 2;

        System.out.println("\n=== OPERATOR PRECEDENCE ===");
        System.out.println("10 + 5 * 2 = " + precedence1);
        System.out.println("(10 + 5) * 2 = " + precedence2);
        System.out.println("20 % 3 + 4 * 2 = " + precedence3);

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("\n=== RELATIONAL OPERATORS ===");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);

        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("\n=== LOGICAL OPERATORS ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + andResult);
        System.out.println("x || y: " + orResult);
        System.out.println("!x: " + notResult);

        int counter = 5;
        int postIncrement = counter++;
        int preIncrement = ++counter;

        System.out.println("\n=== INCREMENT/DECREMENT ===");
        System.out.println("counter after post-increment: " + postIncrement);
        System.out.println("counter after pre-increment: " + preIncrement);
        System.out.println("Final counter value: " + counter);
    }
}