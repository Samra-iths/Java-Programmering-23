package codealongs.Exercises;

public class Student {
    public String name ;
    private int age;
    private double grade;

    public Student (String name, int age, double grade){
        this.name=name;
        this.age=age;
        this.grade=grade;

    }

    public int getAge(){

        return this.age;

    }

    public String getName() {

        return this.name;

    }

    public void setName(String name){

        this.name = name;

    }

    public void printName(){
        System.out.println(this.name);
    }

    public void printGpa(){
        System.out.print(this.grade);
    }
    
   
}

 

