import java.util.*;
public class Code32{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Value-");
        int a=sc.nextInt();
        System.out.println("Enter the Second value-");
        int b=sc.nextInt();
        if(a==b)
        System.out.println("Both Numbers Are Equal");
        
        else if(a>b)
        System.out.println("A is Greater then b");
        else 
        System.out.println("A is lesser then b");
        sc.close();
    

    }
}