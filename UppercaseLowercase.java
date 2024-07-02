import java.util.Scanner;

public class UppercaseLowercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = convertToAlternatingCase(input);
        System.out.println("The alternating case string is: " + result);

        scanner.close();
    }

    public static String convertToAlternatingCase(String str) {
        // Convert all characters to uppercase
        String upperStr = str.toUpperCase();

        // Convert to alternating case
        StringBuilder alternatingCaseStr = new StringBuilder();
        for (int i = 0; i < upperStr.length(); i++) {
            char ch = upperStr.charAt(i);
            if (i % 2 == 0) {
                alternatingCaseStr.append(Character.toUpperCase(ch));
            } else {
                alternatingCaseStr.append(Character.toLowerCase(ch));
            }
        }

        return alternatingCaseStr.toString();
    }
}



