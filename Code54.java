import java.util.*;
public class Code54 {
    public static void main(String...args){
        System.out.println("Enter the Character for which you want to know the ASCII Value :");
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        int ASCIIValue=ch1;
        System.out.println("The ASCII Value of your given " +ch1+ " Character is " +ASCIIValue);
        sc.close();
    }
    
}
