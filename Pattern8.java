import java.util.*;
public class Pattern8 {
    public static void main(String...args){
        System.out.println("Enter the Range of rows for the pattern:-");
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        int number=1;// We take a number variable for incrementing the value of a number in loop 
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+ " ");
                number++; 
            }
            System.out.println();
            sc.close();
        }
        

    }
    
}
