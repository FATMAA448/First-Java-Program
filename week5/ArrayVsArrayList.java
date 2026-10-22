import java.util.Scanner;
import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        System.out.println("=== ARRAY vs ARRAYLIST COMPARISON ===\n");

        System.out.println("--- ARRAY APPROACH ---");

        String[] arrayStudents = new String[3];

        arrayStudents[0] = "Alice";
        arrayStudents[1] = "Bob";
        arrayStudents[2] = "Charlie";

        System.out.println("Array contents:");

        for (String name : arrayStudents) {
            System.out.println(" " + name);
        }

        System.out.println("Array length: " + arrayStudents.length);

        System.out.println("Cannot add a 4th element without creating a new array.\n");

        System.out.println("--- ARRAYLIST APPROACH ---");

        ArrayList<String> listStudents = new ArrayList<>();

        listStudents.add("Alice");
        listStudents.add("Bob");
        listStudents.add("Charlie");

        System.out.println("ArrayList contents:");

        for (String name : listStudents) {
            System.out.println(" " + name);
        }

        System.out.println("ArrayList size: " + listStudents.size());

        listStudents.add("Diana");

        System.out.println("After adding Diana, size: " + listStudents.size());

        listStudents.remove("Bob");

        System.out.println("After removing Bob, size: " + listStudents.size());

        System.out.println("Updated contents: " + listStudents + "\n");

        System.out.println("=== TRADE-OFF COMPARISON ===");
        System.out.println("Feature             | Array       | ArrayList");
        System.out.println("--------------------|-------------|------------");
        System.out.println("Size                | Fixed       | Dynamic");
        System.out.println("Data types          | Primitives & Objects | Objects only");
        System.out.println("Syntax for length   | .length     | .size()");
        System.out.println("Add element         | Assign by index | .add()");
        System.out.println("Remove element      | Manual shift | .remove()");
        System.out.println("Memory efficiency   | Higher      | Lower (overhead)");
        System.out.println("Performance         | Faster access | Slower access");
        System.out.println("Best for            | Fixed-size data | Changing-size data");

        System.out.println("\n=== WHEN TO USE WHICH ===");

        System.out.println("Use ARRAY when:");
        System.out.println(" - The number of elements is known and fixed");
        System.out.println(" - You need maximum performance");
        System.out.println(" - You are storing primitives");

        System.out.println("\nUse ARRAYLIST when:");
        System.out.println(" - The number of elements may change");
        System.out.println(" - You need methods like add, remove, contains");
        System.out.println(" - You are storing objects");
    }
}