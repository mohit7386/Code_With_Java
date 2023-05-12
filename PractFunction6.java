import java.util.*;
public class PractFunction6 {
    public static int power(double x,double n){
        double result=Math.pow(x, n);
        System.out.println(result);
        return 1;
    }
    public static void main(String...args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Value of x");
        double x=sc.nextDouble();
        System.out.println("Enter the power of x");
        double n=sc.nextDouble();
        System.out.println("X to the power of n is :-");
        power(x, n);
        sc.close();
    }
    
}
