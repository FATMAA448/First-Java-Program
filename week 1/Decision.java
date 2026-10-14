public class Decision {
    public static void main(String[] args) {
        int marks = 65;

        if (marks >= 70) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}