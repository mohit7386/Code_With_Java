import java.util.*;
public class Code41 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        System.out.println("we are Printing the sum of even  numbers");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Give the range where you want tp find the sum of even numbers:-");
        int a=sc.nextInt();
        int sum=0;
        System.out.println("These are the even numbers of your given range and we need to find the sum:-");
    
        for(int i=1;i<=a;i++){
            if(i%2==0){
            System.out.println(i);
           sum=sum+i;
        }
    }
           System.out.println("The sum of Even numbers is "+sum);
           sc.close();

            
         }
        }
    
    

