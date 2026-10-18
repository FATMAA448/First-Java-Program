public class DataTypesDemo {
    public static void main(String[] args) {

        byte studentAge = 20;
        short yearOfBirth = 2006;
        int population = 54000000;
        long worldPopulation = 8000000000L;

        float interestRate = 7.5f;
        double accountBalance = 15000.75;

        char grade = 'A';
        char currencySymbol = 'K';

        boolean isActive = true;
        boolean isVerified = false;

        String studentName = "Alice Wanjiku";
        String courseName = "Object-Oriented Programming";

        System.out.println("=== INTEGER TYPES ===");
        System.out.println("Student Age (byte): " + studentAge);
        System.out.println("Year of Birth (short): " + yearOfBirth);
        System.out.println("Kenya Population (int): " + population);
        System.out.println("World Population (long): " + worldPopulation);

        System.out.println("\n=== DECIMAL TYPES ===");
        System.out.println("Interest Rate (float): " + interestRate + "%");
        System.out.println("Account Balance (double): KSh " + accountBalance);

        System.out.println("\n=== CHARACTER TYPE ===");
        System.out.println("Grade (char): " + grade);
        System.out.println("Currency Symbol (char): " + currencySymbol);

        System.out.println("\n=== BOOLEAN TYPE ===");
        System.out.println("Is Active (boolean): " + isActive);
        System.out.println("Is Verified (boolean): " + isVerified);

        System.out.println("\n=== STRING TYPE ===");
        System.out.println("Student Name (String): " + studentName);
        System.out.println("Course Name (String): " + courseName);
    }
}