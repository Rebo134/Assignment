import java.util.Scanner;

public class LexicographicalSubstrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the string:");
        String s = scanner.nextLine();

        // Read the integer k
        System.out.println("Enter the integer k:");
        int k = scanner.nextInt();

        // Get and print the smallest and largest substrings
        System.out.println(getSmallestAndLargest(s, k));
    }
}

