//Reverse half pyramid
import java.util.*;
public class Pattern6 {
    public static void main(String...args){
        System.out.println("Enter the range of Rows for the pattern:- ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print("*");

            }
            System.out.println();
          
    }
    System.out.println("-------------------------------------------------");
    System.out.println("Another Program :-");
    System.out.println("Enter the range of Rows for the pattern:- ");
    int row1=sc.nextInt();
    for(int i=1;i<=row1;i++){
        for(int j=row1;j>=i;j--){
            System.out.print(j);

        }
        System.out.println();
        sc.close();

    
    }
}
}
