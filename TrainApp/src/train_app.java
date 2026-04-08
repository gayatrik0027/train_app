public class train_app {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie Class
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Method to assign cargo safely
        void assignCargo(String cargoType) {
            try {
                // Safety rule
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargoType.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe assignment: Rectangular bogie cannot carry Petroleum");
                }

                // If safe
                this.cargo = cargoType;
                System.out.println("Cargo '" + cargoType +
                        "' assigned to " + shape + " bogie.");

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment attempt completed.\n");
            }
        }

        public String toString() {
            return "Bogie Shape: " + shape + " | Cargo: " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe cargo assignment
        b1.assignCargo("Petroleum");

        // Unsafe cargo assignment
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues safely...");
    }
}