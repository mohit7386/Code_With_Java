// star Pyramid
import java.util.*;
public class Pattern13 {
    public static void main(String...args){
        System.out.println("Enter the Range of rows for the pattern:-");
        Scanner sc= new Scanner (System.in);
        int row=sc.nextInt();;
        for(int i=1;i<=row;i++){
            for(int j= 1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            
            System.out.println();
           
        }
        // Number Pyramid 
        System.out.println("----------------------------");
        System.out.println("Another Program:-");
        System.out.println("Enter the Range of rows for the pattern:-");
        int row1=sc.nextInt();
        for(int i=1;i<=row1;i++){
            for(int j= 1;j<=row1-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            
            System.out.println();
            sc.close();
    }
}}

