import java.util.Scanner;
public class scannerPractive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Förnamn: ");
        String  förnamn= s.nextLine();

        System.out.print("Efternamn: ");
        String  efterNamn= s.nextLine();

        System.out.print("Age: ");
        int  age= s.nextInt();


        System.out.println("Mitt namn är  " + förnamn + " "  +  efterNamn + "." + " Jag är " + age + " år." );
        
        s.close();
    }
}
