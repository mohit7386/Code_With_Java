//Finding the Length of an array 
import java.util.*;
public class Array7 {
    public static void main (String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array :-");
        int size=sc.nextInt();
        System.out.println("Enter the Elements in the array :-");
        int length[]=new int[size];
        for(int i=0;i<size;i++){
            length[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++){
            
        }
        System.out.println("The Length of an array is := "+length.length);
            sc.close();

    }

    
}
