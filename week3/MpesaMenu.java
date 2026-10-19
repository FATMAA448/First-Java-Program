import java.util.Scanner;

public class MpesaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== M-PESA MENU ===");
        System.out.println("1. Send Money");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Buy Airtime");
        System.out.println("4. Check Balance");
        System.out.print("Choose an option (1-4): ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Send Money");
                break;
            case 2:
                System.out.println("You selected Withdraw Cash");
                break;
            case 3:
                System.out.println("You selected Buy Airtime");
                break;
            case 4:
                System.out.println("You selected Check Balance");
                break;
            default:
                System.out.println("Invalid option!");
        }

        input.close();
    }
}