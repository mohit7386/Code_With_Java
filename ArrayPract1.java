import java.util.*;
public class ArrayPract1 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of an Array ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("After Entering the size now Enter the Elements of an array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("These are the Elements of an array Entered by the you ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
         
        }
        sc.close();
    }
    
}
