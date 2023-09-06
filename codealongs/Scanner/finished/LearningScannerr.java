import java.util.Scanner;

public class LearningScannerr {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        int myNumber;
        
         System.out.println("Please input a number: ");
         myNumber = s.nextInt();

         System.out.println("Input the average salary: ");
         double avsalary = s.nextDouble();
         s.nextLine();

         System.out.println("Please enter a message: ");
         String message = s.nextLine();

        System.out.println("Input number " + myNumber);
        System.out.println("Average salary salary is: " + avsalary);
        System.out.println("Message " + message);

  }
    
}
