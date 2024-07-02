import java.util.Scanner;

class StoreMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Initializing an array to store marks
        double[] marks = new double[n];

        // Taking input for marks of each student
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Displaying the marks of all students
        System.out.println("Marks of all students:");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] +" ");
        }

        scanner.close();
    }
}

