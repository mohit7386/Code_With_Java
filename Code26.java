import java.util.*;
public class Code26 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number:-");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:-");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number:-");
        int num3=sc.nextInt();
        if(num1>num2)
        System.out.println("Greater number is: "+num1);
        else if(num2>num3)
        System.out.println("Greater Number is: "+num2);
        else 
        System.out.println("Greater Number is: "+num3);
        System.out.println("After Finding the Greater Number We can do the sum of number3 and number2:");
        System.out.println("The Greater Number is "+num3+" then the sum of "+num3+ " and " +num2+" is "+(num3+num2));
        sc.close();

    }
    
}
