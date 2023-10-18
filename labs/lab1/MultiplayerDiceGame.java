package labs.lab1;
import java.util.Scanner;
import java.security.SecureRandom;



public class MultiplayerDiceGame {
   
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
         
        System.out.println("Enter the number of players");

        int antalSpelare= s.nextInt();

        System.out.println("How many rounds do you want to play?");
          int numberOfround = s.nextInt();

        Player []  playersArray=new Player[antalSpelare];

         for(int i = 0; i < antalSpelare ; i++){
             s.nextLine();
             System.out.println("Player" + (i+1) + " name: ");
             String name = s.nextLine();
             Player player= new Player();
             player.setName(name);

             System.out.println("Number of dice: ");
             int antalDice= s.nextInt();
             player.setAntalDice(antalDice);
             player.setScore(0);
             playersArray[i] = player;
             

         
 
         }
        
        
       
          
          for(int i=0; i< numberOfround;i++){
            

            System.out.println("Starting round " + (i+1) );
            for(int j=0; j<playersArray.length; j++){
                playersArray[j].setScore(0);
                 
                System.out.println( " Player: " + playersArray[j].getName() );
                System.out.println("Guess what number it would be. ");
                int guessDice=s.nextInt();
                System.out.println("Rolling a dice.....");

                int totalDice=0;
                
                int numberOfDice=playersArray[j].getAntalDicce();

                while(numberOfDice>0){
                     numberOfDice-- ;
                     int dice=rand.nextInt(6)+1;
                     totalDice=totalDice + dice;
                }
               
              int dice=5;
                System.out.println(totalDice);
                
                
                if(dice==guessDice){
               System.out.println("Congratulations you scored!!");
              int scored=playersArray[j].getScore()+1;
               playersArray[j].setScore(scored);
               System.out.println("Score: " + playersArray[j].getScore());
                }

                 }

                 
         String winners="";
           
        for(int k=0; k<playersArray.length;k++){
            if(playersArray[k].getScore()==1){
                playersArray[k].setNumberOfwins(playersArray[k].getNumberOfWins()+1);
                
             winners= winners  + playersArray[k].getName() + ",";
           }
            

           }

          if(winners.length() == 0){
            winners="No winner for this round.";
          }
            System.out.println("The winner for round " + (i+1)+ ": " + winners);

           }

           int maxWinNumber=-1;
           String gameWinner="";
           for(int w=0; w<playersArray.length; w++){
            if(maxWinNumber<=playersArray[w].getNumberOfWins()){
                maxWinNumber=playersArray[w].getNumberOfWins();
                gameWinner=gameWinner +playersArray[w].getName() + ", ";
            }
           }

           if(maxWinNumber==0){
            System.out.println("No winner!");
           } else
           System.out.println("The winner is "+  gameWinner + " !");
           

         

           
        
           
        
        
       



         

        
    
     
   

    s.close();

    
    }
    
}

 
