import java.util.Scanner;

public class SubstringExtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the string:");
        String s = scanner.nextLine();

        // Read the start and end indices
        System.out.println("Enter the start and end indices (space-separated):");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Validate the constraints
        if (s.length() < 1 || s.length() > 100) {
            System.out.println("String length must be between 1 and 100.");
            return;
        }

        if (start < 0 || end > s.length() || start >= end) {
            System.out.println("Invalid start or end indices.");
            return;
        }

        // Extract and print the substring
        String substring = s.substring(start, end);
        System.out.println(substring);
    }
}

