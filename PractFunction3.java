import java.util.*;
public class PractFunction3 {
    public static int greaterNumber(int a , int b){
        if(a>b){
            System.out.println("a is Greater than b ");
            return a;
        } else{
            System.out.println("b is Greater then a ");
            return b;
        }
        
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :-");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :-");
        int b=sc.nextInt();
        greaterNumber(a, b);
        sc.close();
    }
    
}
