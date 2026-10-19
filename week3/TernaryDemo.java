import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String result = (age >= 18) ? "You are an adult" : "You are a minor";

        System.out.println(result);

        input.close();
    }
}