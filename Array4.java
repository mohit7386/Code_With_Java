// Printing Names Entered by the User Using Function
import java.util.*;
public class Array4 {
    public static void printNames(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        sc.nextLine(); // Consumes Next Character and print all the names entered by the user..If you don't write this then the result is leave one name..
        System.out.println("Enter the Elements of an Array ");
        String names[]=new String[size];

        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();


        }
        System.out.println("These are the names Entered by the user :-");
          printNames(names);   
          sc.close();  
        }
        

    }
    

