// Taking User Input and Print the perimeter and area of the rectangle
import java.util.*;
public class Code11 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length and breadth of the rectangle:-");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area =l*b;
        int peri=2*(l+b);
        System.out.println("The area of the rectangle is=" +area);
        System.out.println("The perimeter of the rectangle is=" +peri);
        sc.close();
    }
    
}
