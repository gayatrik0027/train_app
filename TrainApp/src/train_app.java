import java.util.Arrays;
import java.util.Scanner;

public class train_app {

    // Binary Search with validation
    public static boolean binarySearch(String[] bogieIds, String key) {

        // ✅ Fail-fast validation (UC20)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of bogies
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input bogie IDs (only if size > 0)
        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = sc.nextLine();
            }
        }

        // Sort before searching
        Arrays.sort(bogieIds);

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Perform search
            boolean found = binarySearch(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // Handle exception gracefully
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}