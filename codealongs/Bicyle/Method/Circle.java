package codealongs.Bicyle.Method;

public class Circle {
    int radius=4;
    

   public double area(int radius){
       this.radius=radius;
       double  areaOfCircle= Math.PI *Math.pow(this.radius,2);
        return areaOfCircle;

    }
    public double circumference(int radius){
        this.radius=radius;
         double circumference= 2*Math.PI*radius;
         return circumference;
     }
     public static void main(String[] args) {
        Circle printArea= new Circle();
        System.out.println(printArea.area(4));
     }
    
}
