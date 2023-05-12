//Hollow rhombus pattern
import java.util.*;
public class Pattern12{
    public static void main(String...args){
        System.out.println("Enter the Range of Rows for the pattern:-");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                if(i==1||j==1||i==row||j==row){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}