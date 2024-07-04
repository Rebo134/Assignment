import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Use a LinkedHashSet to maintain insertion order and remove duplicates
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}

