import java.util.*;
public class Code19{
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age:- ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are an Adult");
        }
        else
        System.out.println("You are not an Adult");
        sc.close();
    }
}