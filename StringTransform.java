import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringTransform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Enter strings (type 'exit' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            strings.add(input);
        }

        List<String> transformedStrings = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);

            // Remove strings shorter than 3 characters
            if (str.length() < 3) {
                continue;
            }

            // Remove strings that contain a digit
            if (str.matches(".*\\d.*")) {
                continue;
            }

            // Convert strings at even indices to lowercase
            if (i % 2 == 0) {
                str = str.toLowerCase();
            }

            // Convert strings at odd indices to uppercase
            if (i % 2 != 0) {
                str = str.toUpperCase();
            }

            // Reverse strings that end with a vowel
            if (str.matches(".*[aeiouAEIOU]$")) {
                str = new StringBuilder(str).reverse().toString();
            }

            transformedStrings.add(str);
        }

        System.out.println(transformedStrings);
    }
}

