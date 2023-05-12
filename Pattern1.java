// Solid Rectangle Star Pattern 
import java.util.*;
public class Pattern1 {
    public static void main (String...args){
        System.out.println("Enter the limit how many lines of star you want to print:- ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("*******");
            sc.close();
        }

    }
    
}
