// Taking User Input Program and find the area of circle 
import java.util.*;
public class Code10 {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:-");
        float rad=sc.nextFloat();
        float area = (3.14f*rad*rad);
        System.out.println("The Area of circle is:- " +area);
        sc.close();
    }
    
}
