// Print the area of Circle using function
import java.util.*;
public class Function5 {
    public static double areaOfCircle(int r){
        double area=(3.14*r*r);
        System.out.println(area);
        return area;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :-");
        int r=sc.nextInt();
        System.out.println("The area of the Circle is :-");
        areaOfCircle(r);
        sc.close();
    }
    
}
