import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Scores {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            int score = scanner.nextInt();
            total += score;

            String result = score >= 60 ? "passed" : "failed";
            System.out.println("Student " + i + " : " + " Score = " + score + " , " + "Result =" + result);
        }

        double average = total / (double) numberOfStudents;
        System.out.println("Average score: " + average);

        scanner.close();
    }
}


