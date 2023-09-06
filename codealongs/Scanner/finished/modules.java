import java.util.Scanner;
public class modules {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number: ");
       int num = s.nextInt();
       

        for(int i=0; i<=num ; i++){
         if(i % 2 != 0) {
            System.out.println(i);
         }

       }

        
    }
    
}