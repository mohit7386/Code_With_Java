import java.util.*;
public class Array2 {
    public static int sumOfArrayElements(int arr[], int sum){
        return 1;

    }
    public static void main (String...args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the Size of an Array");
        int n=sc.nextInt();
       
        int arr[]= new int[n];
        System.out.println("Enter the Elements of an Array ");
        
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
         sum = sum+arr[i];
        
        
        }
        System.out.println("The Sum of Array elements is :-\n"+sum);
        sumOfArrayElements(arr, sum);
        sc.close();
    }

    
}
