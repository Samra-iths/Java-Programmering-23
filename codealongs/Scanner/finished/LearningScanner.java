package codealongs.Scanner.finished;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter the number of teams: ");
        int numberOfTeams = s.nextInt();

        System.out.print("Please enter the average salary: ");
        double avgSalary = s.nextDouble();

        System.out.print("Please enter a message: ");
        s.nextLine(); String msg = s.nextLine();

        System.out.print(" Please inter the start date: ");
        int startDate = s.nextInt();

        System.out.println("The number of teams is: " + numberOfTeams);
        System.out.println("The average salary is: " + avgSalary);
        System.out.println("A message was received:");
        System.out.println("The start date is: " + startDate);
        System.out.println(msg);

        s.close();
    }
}
