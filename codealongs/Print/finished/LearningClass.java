package codealongs.Print.finished;


public class LearningClass {

 
  
String Destination = "okland";
    String child1= "Amen";
    String child2= "Hiruy";
    String child3="Hamelet";
    String Adult="Selam";
    int age1 = 9;
    int age2 = 12;
    int age3 = 2;
    int age4 = 37;

    public int add(int a,int b) {
      int r=a+b;
      return r;

    }
    private double multiple(double a, double b){
      double result= a * b;
      return result;
    }
   
  
   

public static void main(String[] args) {
     LearningClass calc = new LearningClass();
     int additiont=calc.add(4,5);
     double multiplication = calc.multiple(4.8, 5.3);
     
     System.out.println(additiont);
     System.out.println(multiplication);

}
}