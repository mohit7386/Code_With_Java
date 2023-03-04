import java.util.*;
public class Code10 {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:-");
        float rad=sc.nextFloat();
        float area =(float) (3.14*rad*rad);
        System.out.println("The Area of circle is:- " +area);
        sc.close();
    }
    
}
