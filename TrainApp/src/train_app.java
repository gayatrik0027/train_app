import java.util.ArrayList;
import java.util.List;

public class train_app {

    // Goods Bogie Class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String toString() {
            return "Bogie Type: " + type + " | Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        goodsBogies.forEach(System.out::println);

        // Safety compliance check using Stream
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical")
                                || b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain formation is SAFETY COMPLIANT.");
        } else {
            System.out.println("\nTrain formation is NOT SAFE. Cargo rule violated.");
        }

        System.out.println("\nProgram continues...");
    }
}