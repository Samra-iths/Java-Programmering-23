import java.util.Scanner;


public class Keyboard {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(" What country are you living in ?");
        keyboard.nextLine();
        System.out.println("which city is it ?");
        keyboard.nextLine();
        System.out.println("How many years did you live there ?");
        keyboard.nextDouble();
        
        System.out.println("Is there any thing you want to say ?" );
        String message= keyboard.nextLine();

        System.out.println(message);

        keyboard.close();
    }
    
}
