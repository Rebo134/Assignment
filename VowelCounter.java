import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);
        System.out.println("The number of vowels in the string is: " + vowelCount);

        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}

