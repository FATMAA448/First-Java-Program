import java.util.ArrayList;

public class ArrayListBasics {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        System.out.println("=== ADDING ELEMENTS ===");

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("After adding: " + names);

        names.add(1, "Diana");

        System.out.println("After adding Diana at index 1: " + names);

        System.out.println("\n=== ACCESSING ELEMENTS ===");

        System.out.println("First element: " + names.get(0));
        System.out.println("Element at index 2: " + names.get(2));
        System.out.println("Last element: " + names.get(names.size() - 1));

        System.out.println("\n=== SIZE ===");

        System.out.println("Number of names: " + names.size());

        System.out.println("\n=== CONTAINS ===");

        System.out.println("Contains Bob? " + names.contains("Bob"));
        System.out.println("Contains Eve? " + names.contains("Eve"));

        System.out.println("\n=== INDEX OF ===");

        System.out.println("Index of Charlie: " + names.indexOf("Charlie"));
        System.out.println("Index of Eve: " + names.indexOf("Eve"));

        System.out.println("\n=== REMOVING ELEMENTS ===");

        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        names.remove(0);
        System.out.println("After removing element at index 0: " + names);

        System.out.println("\n=== UPDATING ELEMENTS ===");

        names.set(0, "Eve");
        System.out.println("After setting index 0 to Eve: " + names);

        System.out.println("\n=== ITERATING WITH TRADITIONAL FOR LOOP ===");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        System.out.println("\n=== ITERATING WITH ENHANCED FOR LOOP ===");

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("\n=== CLEARING THE LIST ===");

        names.clear();
        System.out.println("After clearing: " + names);
        System.out.println("Size after clearing: " + names.size());

        System.out.println("\n=== ARRAYLIST OF INTEGERS ===");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(85);
        scores.add(92);
        scores.add(78);

        System.out.println("Scores: " + scores);

        int firstScore = scores.get(0);
        System.out.println("First score: " + firstScore);

        int total = 0;

        for (int score : scores) {
            total += score;
        }

        System.out.println("Total: " + total);
    }
}