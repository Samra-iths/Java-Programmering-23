package codealongs.Exercises;

public class Book {
    String title;
    String author;
    int year;
    public Book(String title, String author, int year){
         this.title= title;
         this. author=  author;
         this.year=2023;
        
    }
      public void printBook(){
        System.out.println("Title: " + title);
        System.out.println( "Author: " + author);
        System.out.println("Year: " + year);


      }

        public static void main(String[] args) {
            Book book=new Book("Nati", "Kenzie", 1984);
            book.printBook();

        
        } 
}
