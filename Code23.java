import java.util.*;
public class Code23 {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:-");
        int num=sc.nextInt();
        System.out.println("Enter Second Number:-");
        int num2=sc.nextInt();
        if(num>num2)
        System.out.println(num+" is Greater then "+num2);
        else
        System.out.println(num2+" is Greater than "+num);
        sc.close();



    }
    
}
