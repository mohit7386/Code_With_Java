//Half Pyramid problem
import java.util.*;
public class Pattern5 {
    public static void main(String...args){
        System.out.println("Enter the range of Rows of the pattern:- ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        System.out.println("---------------------Another program---------------------------");
        System.out.println("Enter the Range of rows:");
        int row2=sc.nextInt();
        for(int i=1;i<=row2;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();}
             sc.close();
            
        }
    }

    
 

