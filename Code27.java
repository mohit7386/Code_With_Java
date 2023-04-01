import java.util.*;
public class Code27 {
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Checking the Number is Divisible by 7 or not: ");
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter the first Number:");
        int num1=sc.nextInt();
        if(num1%7==0){
        System.out.println("Given Number is Divisible by 7 ");
        }
        else 
        System.out.println(" Number is not Divisible by 7");
        sc.close();

    }
    
}
