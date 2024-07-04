import java.util.Scanner;

class PalindromicSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the string:");
        String s = scanner.nextLine();

        // Find the number of palindromic substrings
        int count = countPalindromicSubstrings(s);

        // Print the result
        System.out.println("Number of palindromic substrings: " + count);
    }

    private static int countPalindromicSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Center expansion method
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}

