package codealongs.Bicyle.Method;

public class Rectangle {
   private int base;
    private int height;
    public double area (int base, int height){
        this.base=base;
        this.height=height;
       double areaOfRectangle= base * height;
       return areaOfRectangle;

    }
    public double  perferial(int base, int height){
        this.base=base;
        this.height=height;
       double perferialOfRectangle=2 * (base + height);
       return perferialOfRectangle;
    }

    
}
