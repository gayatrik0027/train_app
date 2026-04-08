import java.util.LinkedList;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("After inserting Pantry Car:");
        System.out.println(trainConsist);

        // Remove first bogie
        trainConsist.removeFirst();

        // Remove last bogie
        trainConsist.removeLast();

        System.out.println("Final Train Consist:");
        System.out.println(trainConsist);

        System.out.println("Program continues...");
    }
}