import java.util.*;
public class PractFunction2 {
    public static int printAllOdd(int num ){
        int sum = 0;
            for(int i=1;i<=num;i++){
                if(i%2!=0){
                sum = sum+i;
                }
            }
        System.out.println(sum);
        return sum;  
    }
        
   
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range Where  you want to print the sum of all odd numbers :-");
        int num=sc.nextInt();
        
        System.out.println("The Result of print all odd numbers from 1 to n is :-");
        printAllOdd(num); 
        sc.close();
}
}
