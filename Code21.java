import java.util.*;
public class Code21 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age ");
        int age =sc.nextInt();
        if(age>=1 && age<=17){
            System.out.println("You are not an Adult...You are KID");
        }
        else if(age>17&&age<=60){
            System.out.println("You are an Adult");
        }
        else if(age>60&&age<=100){
            System.out.println("Senior Citizens");
        }
        else 
        System.out.println("Wrong Input");
        sc.close();
    }
        
    
}


