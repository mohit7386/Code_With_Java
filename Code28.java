import java.util.*;
public class Code28 {
    public static void main (String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Enter any Number and I am Checking the given  Number is Divisible by 19 or not");
        int num=sc.nextInt();
        if(num%19==0)
        System.out.println(+num+" is Divisible by 19");
        else 
        System.out.println(+num+" is not Divisible by 19");
        sc.close();
    }
    
}
