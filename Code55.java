import java.util.*;
public class Code55 {
    public static void main (String...args){
        System.out.println("Enter any Number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is Positive ");
        }
        else 
        System.out.println("Number is Negative ");
        sc.close();
    }
    
}
