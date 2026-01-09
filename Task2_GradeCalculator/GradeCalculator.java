import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += scanner.nextInt();
        }

        double average = (double) total / subjects;
        char grade;

        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 40) grade = 'D';
        else grade = 'F';

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
