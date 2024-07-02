import java.util.Scanner;

public class StringQueryCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input strings
        System.out.println("Enter the number of input strings:");
        int inputCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] inputStrings = new String[inputCount];
        System.out.println("Enter the input strings:");
        for (int i = 0; i < inputCount; i++) {
            inputStrings[i] = scanner.nextLine();
        }

        // Reading query strings
        System.out.println("Enter the number of query strings:");
        int queryCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] queryStrings = new String[queryCount];
        System.out.println("Enter the query strings:");
        for (int i = 0; i < queryCount; i++) {
            queryStrings[i] = scanner.nextLine();
        }

        // Counting occurrences
        int[] result = countOccurrences(inputStrings, queryStrings);

        // Printing results
        System.out.println("Output:");
        for (int count : result) {
            System.out.println(count);
        }
    }

    private static int[] countOccurrences(String[] inputStrings, String[] queryStrings) {
        int[] result = new int[queryStrings.length];

        for (int i = 0; i < queryStrings.length; i++) {
            String query = queryStrings[i];
            int count = 0;
            for (String input : inputStrings) {
                if (query.equals(input)) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}

