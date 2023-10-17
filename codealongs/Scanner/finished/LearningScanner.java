import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please input a number: ");
        myNumber = scanner.nextInt();

        System.out.println("Input the average salary: ");
        double avgSalary = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Please enter a message: ");
        scanner.nextLine(); String msg = scanner.nextLine();

        System.out.println("The number of teams is: " + myNumber);
        System.out.println("The average salary is: " + avgSalary);
        System.out.println("A message was received:");
        System.out.println(msg);

        scanner.close();
    }
}
