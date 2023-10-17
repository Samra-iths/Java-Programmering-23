package codealongs.Exercises;

public class main {
    
    public static void main(String[] args) {
        Student samra=  new Student("samra",21,4.6);
        samra.printName();
        samra.setName("Samra kifetew");
        samra.printName();
        samra.name ="Kenzie";
        System.out.println(samra.name);
         int ageOfSamra = samra.getAge();
         samra.printGpa();  
         
         Student kenzie = new Student("kenzie",7,2.0);
         Student Nathan = new Student("Nathan", 1,4.0);
         Student Daniel = new Student("Daniel",38,1.8);

          Student allStudents [] = new Student[4];
          allStudents[0]= samra;
          allStudents[1]=kenzie;
          allStudents[2]=Nathan;
          allStudents[3]=Daniel;

          for (int i=0 ; i<allStudents.length; i++){
            allStudents[i].printName();

          }
          


        }

        
}
