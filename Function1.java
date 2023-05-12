//WAP for Printing your name using functions..
import java.util.*;
public class Function1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String...args){
        System.out.println("Enter Your Name :-");
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();
        printMyName(name);
        sc.close();
    }

    
}
