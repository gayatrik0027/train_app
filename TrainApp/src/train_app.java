import java.util.Arrays;
import java.util.Scanner;

public class train_app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of bogies
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        // Input bogie names
        System.out.println("Enter bogie type names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogieNames));

        sc.close();
    }
}