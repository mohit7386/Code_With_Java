import java.util.*;
public class Code24 {
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first Number:-");
        int num1=sc.nextInt();
        System.out.println("Enter second Number:-");
        int num2=sc.nextInt();
        System.out.println("Enter Third Number:-");
        int num3=sc.nextInt();
        if(num1>10&&num1!=0)
        System.out.println(num1+" is Greater then 10 and not equal to 0 then the multiplication of the "+num2+ " and " +num3+ " is " +num2*num3);
        else
        System.out.println("First number is less then 10 and the sum of " +num2+ " and " +num3+ " is " +(num2+num3));
        sc.close();

    }
    
}
