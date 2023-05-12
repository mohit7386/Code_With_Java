// Hollow Star Pattern
import java.util.*;
public class Pattern4 {
    public static void main(String...args){
        System.out.println("Enter the rows value :-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter the cols value:-");
        int cols =sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1||j==1||i==row||j==cols){
                    System.out.print("*");
                } 
                else 
                System.out.print(" ");
             
            }
            System.out.println();
            sc.close();
        }
    }
    
}
