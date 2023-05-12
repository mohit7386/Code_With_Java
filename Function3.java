import java.util.*;
public class Function3 {
    public static int multiplyNumber(int a , int b){
        int mul=a*b;
        return mul;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the the value of a :-");
        int a=sc.nextInt();
        System.out.println("Enter the Value of b :-");
        int b=sc.nextInt();
        int mul=multiplyNumber(a, b);
        System.out.println("The Multiplication of " +a+ " and "+b+ " is :-  \n" +mul );
        sc.close();
    }
    
}
