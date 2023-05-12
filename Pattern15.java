//Diamond Star Pattern 
import java.util.*;
public class Pattern15 {
    public static void main(String...args){
        System.out.println("Enter the Range of Rows for the Pattern:-");
        Scanner sc =new Scanner(System.in);
        int row =sc.nextInt();
        // Space Printing
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
            for(int i=row;i>=1;i--){
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*"+ " ");
                }
                System.out.println();
                sc.close();


        }

    }
    
}
