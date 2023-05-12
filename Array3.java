// This program for find the index of element in the given array 
import java.util.*;
public class Array3 {
    public static void main(String...args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter an element for which you want to find the index.");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
        if(arr[i]==x){
            System.out.println("X found in the index : "+i);
        }
        sc.close();
        }
    }
    
}
