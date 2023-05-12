import java.util.*;
public class PractFunction4 {
    public static int eligibleForVote(int age){
        if(age>18){
            System.out.println("Congrats! You are Eligible for Vote");
        }
        else 
        System.out.println("Sorry! You are Not Eligible");
        return 1;
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age ");
        int age=sc.nextInt();
        eligibleForVote(age);
        sc.close();
    }
    
}
