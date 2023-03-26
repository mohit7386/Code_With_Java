// Program to print the perimeter of the parallelogram 
import java.util.*;
public class Code12 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the edges of the parallelogram:-");
        int s=sc.nextInt();
        int b=sc.nextInt();
        int peri=2*(s+b);
        System.out.println("The perimeter of the parallelogram is= " +peri);
        sc.close();
    }
    
}
