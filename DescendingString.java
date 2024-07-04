import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class DescendingString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a TreeSet with a custom comparator for descending order
        Set<String> strings = new TreeSet<>(Comparator.reverseOrder());

        System.out.println("Enter strings (type 'exit' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Strings in descending order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

