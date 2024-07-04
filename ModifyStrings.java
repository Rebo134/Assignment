import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifyStrings {

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

        for (int i = 1; i < strings.size(); i += 2) {
            strings.set(i, new StringBuilder(strings.get(i)).reverse().toString());
        }

        System.out.println(strings);
    }
}

