//Taking the user input and Swapping the given Values without the help of third variable 
import java.util.*;
public class Code16 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping the Values are:- ");
        System.out.println("The value of a is:-" +a);
        System.out.println("The value of b is:-" +b);
        sc.close();
    }
    
}
