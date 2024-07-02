import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of classrooms
        System.out.print("Enter the number of classrooms: ");
        int classrooms = scanner.nextInt();

        // Taking input for number of students in each classroom
        int[] studentsPerClassroom = new int[classrooms];
        for (int i = 0; i < classrooms; i++) {
            System.out.print("Enter the number of students in classroom " + (i + 1) + ": ");
            studentsPerClassroom[i] = scanner.nextInt();
        }

        // Creating a 2D array to store marks
        double[][] marks = new double[classrooms][];
        for (int i = 0; i < classrooms; i++) {
            marks[i] = new double[studentsPerClassroom[i]];
            for (int j = 0; j < studentsPerClassroom[i]; j++) {
                System.out.print("Enter the marks of student " + (j + 1) + " in classroom " + (i + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Displaying the marks of all students
        System.out.println("\nMarks of all students:");
        for (int i = 0; i < classrooms; i++) {
            System.out.print("Classroom " + (i + 1) + ":");
            for (int j = 0; j < studentsPerClassroom[i]; j++) {
                System.out.print(" " + "Student " + (j + 1) + ": " + marks[i][j]);
            }
            System.out.println(); // Adding a newline for separation
        }

        scanner.close();
    }
}

