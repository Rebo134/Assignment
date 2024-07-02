import java.util.Scanner;

public class StringManipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String result = concatenateAndReverse(str1, str2);
        System.out.println("The concatenated and reversed string is: " + result);

        scanner.close();
    }

    public static String concatenateAndReverse(String str1, String str2) {
        // Concatenate the strings
        String concatenatedString = str1 + str2;

        // Reverse the concatenated string
        String reversedString = new StringBuilder(concatenatedString).reverse().toString();

        return reversedString;
    }
}

