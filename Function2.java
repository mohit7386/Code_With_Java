import java.util.*;
public class Function2 {
    public static int calculateSum(int a , int b ,int sum){
        System.out.println(sum);
        return 1;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of a :-");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :-");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.println("The Addition of " +a+ " and " +b+ " is :-");
        calculateSum(a, b, sum);
        sc.close();
    }
    
}
