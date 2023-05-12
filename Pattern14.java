//Palindrome Number pattern
import java.util.*;
public class Pattern14 {
    public static void main(String...args){
        System.out.println("Enter the Range of Rows for the pattern:-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            // Space printing
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //First half Numbers Printing
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Second Half Numbers Printing
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
            sc.close();
        }

    }
    
}
