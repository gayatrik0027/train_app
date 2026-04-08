import java.util.LinkedHashSet;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for bogies
        LinkedHashSet<String> bogies = new LinkedHashSet<>();

        // Add bogies
        bogies.add("Engine");
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("Cargo");
        bogies.add("Guard");

        // Attempt to add duplicate
        bogies.add("Sleeper");

        System.out.println("Train bogies after insertion:");
        System.out.println(bogies);

        // Remove a bogie
        bogies.remove("Cargo");

        System.out.println("After removing Cargo bogie:");
        System.out.println(bogies);

        System.out.println("Total bogies in consist: " + bogies.size());

        System.out.println("Program continues...");
    }
}