import java.util.Scanner;
public class Sign {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("Enter a number ");
         int number= s.nextInt();
         if(number < 0){
            System.out.println("It is a a negartive number.");
            }

            else if (number == 0){
                System.out.print(" It is null.");

            }
            else 
            System.out.print("It is a positive number");
    }
}
