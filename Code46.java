import java.util.*;
public class Code46 {
    public static void main(String...args){
        System.out.println("Which number's factorial do you want to know?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
         


            
        }
        System.out.println("THe factorial of the " +n+ " is " +factorial);
        sc.close();
    }
    
}
