import java.util.Scanner;
import java.util.ArrayList;

public class StudentRoster {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"Math", "English", "Science"};

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<int[]> studentMarks = new ArrayList<>();

        studentNames.add("Alice");
        studentMarks.add(new int[]{85, 90, 78});

        studentNames.add("Bob");
        studentMarks.add(new int[]{72, 88, 91});

        studentNames.add("Charlie");
        studentMarks.add(new int[]{65, 75, 80});

        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("          STUDENT ROSTER MANAGER");
            System.out.println("==============================================");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. View Class Average");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.println("==============================================");
            System.out.print("Enter your choice (1-6): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    int[] marks = new int[subjects.length];

                    for (int i = 0; i < subjects.length; i++) {
                        System.out.print("Enter marks for " + subjects[i] + ": ");
                        marks[i] = scanner.nextInt();
                    }
                    scanner.nextLine();

                    studentNames.add(name);
                    studentMarks.add(marks);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n=== STUDENT ROSTER ===");
                    System.out.printf("%-12s", "Student");

                    for (String subject : subjects) {
                        System.out.printf("%-12s", subject);
                    }
                    System.out.println("Average");

                    System.out.println("------------------------------------------------");

                    for (int i = 0; i < studentNames.size(); i++) {
                        int[] m = studentMarks.get(i);
                        double total = 0;

                        System.out.printf("%-12s", studentNames.get(i));

                        for (int mark : m) {
                            System.out.printf("%-12d", mark);
                            total += mark;
                        }

                        System.out.printf("%.2f%n", total / m.length);
                    }
                    break;

                case 3:
                    if (studentMarks.isEmpty()) {
                        System.out.println("No students available.");
                        break;
                    }

                    double totalMarks = 0;
                    int count = 0;

                    for (int[] m : studentMarks) {
                        for (int mark : m) {
                            totalMarks += mark;
                            count++;
                        }
                    }

                    System.out.printf("Class average: %.2f%n",
                            totalMarks / count);
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();

                    int index = studentNames.indexOf(searchName);

                    if (index != -1) {
                        System.out.println("Student found: " + studentNames.get(index));
                        System.out.println("Marks: "
                                + java.util.Arrays.toString(studentMarks.get(index)));
                    } else {
                        System.out.println("Student '" + searchName + "' not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter name to remove: ");
                    String removeName = scanner.nextLine();

                    int removeIndex = studentNames.indexOf(removeName);

                    if (removeIndex != -1) {
                        studentNames.remove(removeIndex);
                        studentMarks.remove(removeIndex);
                        System.out.println("Student '" + removeName + "' removed.");
                    } else {
                        System.out.println("Student '" + removeName + "' not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the Student Roster Manager!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-6.");
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }
}