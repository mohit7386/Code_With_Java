import java.util.*;
public class Code53 {
    public static void main(String...args){
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num<16){
            System.out.println(num);
            num+=1;
        }
        System.out.println("  ");
      
        do{
            System.out.println(num); // Here atleast one statement is printing either the conditon is true and false, after printing then check the condition 
        }
        while(num<17);
        
        sc.close();
    }
    
}
