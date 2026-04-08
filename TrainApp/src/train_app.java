import java.util.ArrayList;
import java.util.List;

public class train_app {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list of bogies
        List<String> bogies = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());

        // Program continues
        System.out.println("System ready to add bogies...");
    }
}