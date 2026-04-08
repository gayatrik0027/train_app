import java.util.ArrayList;
import java.util.List;

public class train_app {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Bogie List:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Stream aggregation to calculate total seating capacity
        int totalSeats = bogies
                .stream()
                .map(b -> b.capacity)     // extract capacity
                .reduce(0, Integer::sum); // aggregate values

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        System.out.println("\nProgram continues...");
    }
}