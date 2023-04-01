import java.util.*;
public class Code25 {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:-");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:-");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number:-");
        int num3=sc.nextInt();
        if(num1>num2){
        System.out.println("Checking Conditions:----");
        System.out.println("Num1 is greater then num2 then the multiplication of "+num1+" and " +num2+ " is "+num1*num2);
        }
        
        else if(num2>num3){
        System.out.println("Checking Conditions:-----");
        System.out.println("num2 is greater then num3 then the sum of "+num2+ " and "+num3+" is " +(num2+num3));
        }
    
        else 
        System.out.println("When both the conditions not satisfied then the Subtraction of "+num3+" and "+num1+" is "+(num3-num1));
        sc.close();
    }
    
}
