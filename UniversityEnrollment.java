import java.util.Scanner;

// Define the custom exception for under age
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

// Define the custom exception for over age
class OverAgeException extends Exception {
    public OverAgeException(String message) {
        super(message);
    }
}

// Define the Student class
class Student {
    private int age;

    // Method to accept input
    public void acceptInput(int age) {
        this.age = age;
    }

    // Method to verify age
    public void verify() throws UnderAgeException, OverAgeException {
        if (age < 17) {
            throw new UnderAgeException("You are too young to enroll in the university. Please wait until you turn 17.");
        } else if (age > 25) {
            throw new OverAgeException("You are too old to enroll in the university. Please contact the admissions office for further assistance.");
        } else {
            System.out.println("You are eligible to enroll in the university.");
        }
    }
}

// Define the University class
class University {
    // Method to initiate the process
    public void initiate() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        student.acceptInput(age);

        try {
            student.verify();
        } catch (UnderAgeException | OverAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

// Main class to launch the application
public class UniversityEnrollment {
    public static void main(String[] args) {
        University university = new University();
        university.initiate();
    }
}

