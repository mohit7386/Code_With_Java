//Butterfly pattern
import java.util.*;
public class Pattern10 {
    public static void main(String...args){
        System.out.println("Enter the Range of Row for the pattern :- ");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            int spaces=2*(row-i);
            for (int j=0;j<=spaces;j++){
                System.out.print(" "+ " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+ " ");

    }
    System.out.println();
    
} // Upper part of the butterfly patternis completed
for(int i=row;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*"+ " ");
    }
    int spaces=2*(row-i);
    for (int j=0;j<=spaces;j++){
        System.out.print(" "+ " ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*"+ " ");

}
System.out.println();
sc.close();
}
    }
}

