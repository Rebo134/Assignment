import java.util.Scanner;

class StudentMarks3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of classrooms, students per classroom, and subjects per student
        System.out.print("Enter the number of classrooms: ");
        int classrooms = scanner.nextInt();

        System.out.print("Enter the number of students per classroom: ");
        int studentsPerClassroom = scanner.nextInt();

        System.out.print("Enter the number of subjects per student: ");
        int subjectsPerStudent = scanner.nextInt();

        // Creating a 3D array to store marks
        double[][][] marks = new double[classrooms][studentsPerClassroom][subjectsPerStudent];

        // Taking input for marks of each student in each subject
        for (int i = 0; i < classrooms; i++) {
            for (int j = 0; j < studentsPerClassroom; j++) {
                System.out.println("\nEnter marks for Classroom " + (i + 1) + ", Student " + (j + 1) + ":");

                for (int k = 0; k < subjectsPerStudent; k++) {
                    System.out.print("Enter marks for Subject " + (k + 1) + ": ");
                    marks[i][j][k] = scanner.nextDouble();
                }
            }
        }

        // Displaying the marks of all students
        System.out.println("\nMarks of all students:");

        for (int i = 0; i < classrooms; i++) {
            System.out.println("\nClassroom " + (i + 1) + ":");

            for (int j = 0; j < studentsPerClassroom; j++) {
                System.out.println(" " + "Student " + (j + 1) + ":");

                for (int k = 0; k < subjectsPerStudent; k++) {
                    System.out.println(" " + "Subject " + (k + 1) + ": " + marks[i][j][k]);
                }
            }
        }

        scanner.close();
    }
}

