//Solid Rhombus
import java.util.*;
public class Pattern11 {
    public static void main(String...args){
        System.out.println("Enter the Range of Rows for the Pattern :-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i;j++){
                System.out.print(" ");

            }

        

            for(int j=1;j<=row;j++){
                System.out.print("*");
    }
    System.out.println();
    sc.close();
        }    
}
}
