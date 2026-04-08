import java.util.HashMap;
import java.util.Map;

public class train_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie and capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display the mapping
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("Program continues...");
    }
}