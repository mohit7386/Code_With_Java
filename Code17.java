import java.util.*;
public class Code17 {
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Swapping the value using third variable");
        System.out.println("Enter the value of a ");
        int a =sc.nextInt();
        System.out.println("Enter the value of b ");
        int b =sc.nextInt();
        int c;
        System.out.println("After Swapping the values with the help of third variable ");
        c=a;
        a=b;
        b=c;
        System.out.println("The value of a is:-" +a);
        System.out.println("The value of b is:-" +b);
        sc.close();

    }
    
}
