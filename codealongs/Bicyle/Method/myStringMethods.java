package codealongs.Bicyle.Method;
import java.io.*;

public class myStringMethods {
   private String word;
   private char lookAfter;
   
   StringBuilder reversedWord=new StringBuilder();

String reverseString(String word){

    this.word=word;
    int length=word.length();
    char temp [] = new  char  [word.length()];

     for (int i=0; i<this.word.length();i++){
        
        reversedWord.append(word.charAt(length-i-1));
           temp[i] = word.charAt(word.length() -i -1);
      }

      System.out.println(new String(temp));
     System.out.println(reversedWord);
     
     return reversedWord.toString() ;
}

int countCharacters(String word, char lookAfter){
    this.word=word;
    this.lookAfter=lookAfter;
    int count=0;

    for(int i=0; i<word.length(); i++){
        if(lookAfter==word.charAt(i)){
            count++;
        }
       

    }
     return count;


}

public static void main(String[] args) {
    myStringMethods count= new myStringMethods();
    System.out.println(count.countCharacters("mammayeyenewuddddddddd", 'z'));
    
    count.reverseString("xy");
    
}

}


 