public class train_app {

    // Custom Exception Class
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger Bogie Class
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor with validation
        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String toString() {
            return "Bogie Type: " + type + " | Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // Invalid Bogie (capacity <= 0)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}