package labs.lab1;


public class Player {
    
        
    private String name ;
    private int antalDice =-1;
    private int score=0;
    private int numberOfwins=0;

    public Player(){
       
    }

    public String getName(){
        return this.name;
    }

    public int getAntalDicce(){
        return this.antalDice;
    }

    public int getScore(){
        return this.score;
    }
    public void setName(String name){
         this.name=name;
    }
    public void setAntalDice(int antalDice){
        this.antalDice = antalDice; 
    }
    public void setScore(int score){
        this.score = score;
    }
     
    public int getNumberOfWins(){
        return this.numberOfwins;
    }
    public void  setNumberOfwins(int numberOfwins){
        this.numberOfwins=numberOfwins;

    }
}
