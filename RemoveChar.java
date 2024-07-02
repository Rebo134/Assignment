import java.util.Scanner;

class RemoveChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to remove: ");
        char characterToRemove = scanner.next().charAt(0);

        String result = removeCharacter(inputString, characterToRemove);
        System.out.println("The string after removing '" + characterToRemove + "' is: " + result);

        scanner.close();
    }

    public static String removeCharacter(String str, char ch) {
        // Remove all occurrences of the specified character
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}

