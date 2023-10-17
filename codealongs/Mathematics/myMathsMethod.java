package codealongs.Mathematics;

public class myMathsMethod {
    int number;
    public int factorial(int number){
        
        this.number= number;
         int result=number;
         if(number==0){
            return 1;
         }
        else
         for(int i=number-1; i>0; i--){
         result=i*result;
         System.out.println(result);
        
         }

        return result;
        

    }

    public int Fabucino(int number){

       this.number=number;
        int result=0;
        int memory=0;
        int current=1;
        if(number==1){
            return 0;
            }
            else if(number==2){
                return 1;
            }
            else if (number<=0){
                System.out.println("Invalid position");
                 
                
            }
            else {
                for(int i=3;i<=number; i++){
                    result=current+memory;
                    memory=current;
                    current=result;


                }
            }
            return result;

        
    }
    public boolean isPrime(int number){
        this.number=number;
        boolean isPrime=true;
        int modules;
        if(number<=1){
            isPrime=false;
        }

        for(int i=2; i<number; i++){
            modules= number % i;
            if (modules==0){
            isPrime=false;
           }
           
        }

    return isPrime;



    }
    public static void main(String[] args) {
        myMathsMethod primeNumber=new myMathsMethod();
        System.out.println(primeNumber.isPrime(11));
    }
}
