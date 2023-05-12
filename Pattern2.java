//Solid Star Pattern
import java.util.*;
public class Pattern2 {
    public static void main(String...args){
        System.out.println("Enter how many rows you want to print in your solid star pattern :-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter how many Columns you want to print in your solid star pattern :-");
        int col=sc.nextInt();
        System.out.println("Here is the result of your Solid Star Pattern:-");
        for(int i=1;i<=row;i++){ //This is our Inner Loop for printing and counting the rows of our pattern
            for(int j=1;j<=col;j++){ //This is our Outer Loop for printing and counting the Columns of our pattern
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }


    }
    
}
