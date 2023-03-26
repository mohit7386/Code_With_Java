import java.util.*;
public class Code13 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Find the perimeter of an equilateral triangle:-");
        System.out.println("Enter the side of an equilateral triangle:-");
        float s=sc.nextInt();
        float peri=3*s;
        System.out.println("The perimeter of an equilateral triangle is= " +peri);
        sc.close();
    }
    
}
