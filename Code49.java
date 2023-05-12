import java.util.*;
public class Code49 {
    public static void main(String...args){
        System.out.println("Which Number you want to Square root:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int SquareRoot=(int)Math.sqrt(num);
        System.out.println("The Square Root of " +num+ " is " +SquareRoot);
        sc.close();
    }
    
}
