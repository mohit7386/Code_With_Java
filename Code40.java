import java.util.*;
public class Code40 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of number where you want to add the sum of these numbers:-");
        int num =sc.nextInt();
        System.out.println("These are the number with the range you given:-");
        int sum=0;
        for(int i=1;i<=num;i++){
  
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("The Sum of 1 to "+num+" Numbers you entered is "+sum);
        sc.close();
    }


    
    
}
