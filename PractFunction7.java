import java.util.*;
public class PractFunction7 {
    public static int gcdNumber(int num1 ,int num2){
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
                return num1;
            }
          
            else {
            num2=num2-num1;
            }}
        return num2;

    }
    public static void main (String...args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Value of Num1 :-");
        int num1=sc.nextInt();
        System.out.println("Enter the Value of Num2 :-");
        int num2=sc.nextInt();
        int gcd = gcdNumber(num1, num2);
        System.out.println("The GCD of "+num1+ " and "+num2+" is :-\n"+gcd);
       
       
        
        sc.close();
    }
    
}
