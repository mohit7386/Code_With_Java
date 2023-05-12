//Inverted Half Pyramid 
import java.util.*;
public class Pattern7 {
    public static void main(String...args){
        System.out.println("Enter the range of rows for the pattern :-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
           for(int j=1;j<=row-i;j++){
            System.out.print(" ");
           }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
           System.out.println();
           sc.close();

        }

    }
    
    
}
