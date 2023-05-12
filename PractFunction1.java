import java.util.*;
public class PractFunction1{
    public static int averageNumbers(int a , int b ,int c ){
        int avg=(a+b+c)/3;
        System.out.println(avg);
        return 1;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of a :-");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :-");
        int b=sc.nextInt();
        System.out.println("Enter the Value of c :-");
        int c=sc.nextInt();
        System.out.println("The Average of 3 Numbers Entered by user is :-");
        averageNumbers(a, b, c);
        
        
        sc.close();
    }

}