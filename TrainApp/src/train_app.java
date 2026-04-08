vimport java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class train_app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Regex patterns
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);

        // User input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID. Expected format: TRN-1234");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID. Expected format: PET-AB");
        }

        System.out.println("Program continues...");

        sc.close();
    }
}