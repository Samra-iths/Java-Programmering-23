
package codealongs.Print.finished;

 import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = s.nextInt();
        int num2= s.nextInt();
        int num3 = s.nextInt();

         int bigNummber=num1;
         if (num1>num2) bigNummber=num1;
         
         int big = num1;
         if (num2 > big) big = num2;
         if (num3 > big) big = num3;
         System.out.println(big);

    } 
    
}
