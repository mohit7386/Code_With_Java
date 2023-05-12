// Find the Minimum and Maximum Value of an array 
import java.util.*;
public class Array6 {
    public static void main (String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array ");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of an Array ");
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE; // It holds minimum Value of Integer Datatype
        int min=Integer.MAX_VALUE; // It holds maximum Value of Integer Datatype
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max)
            max=numbers[i];
        }
        System.out.println("Minimum number is :- "+min);
        System.out.println("Largest number is :- "+max);
        sc.close();
    }
    
}
