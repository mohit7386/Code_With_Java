import java.util.*;
public class Code51 {
    public static void main(String...args){
        System.out.println("Enter any number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Here all the numbers after entering your number");
        while(num<20){
         
            System.out.println(num);
            num=num+1;
        }
       
        sc.close();

    }
    
}
