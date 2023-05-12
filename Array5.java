// Printing the Names Entered by the User 
import java.util.*;
public class Array5 {
    public static void main (String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array ");
        int size=sc.nextInt();
        sc.nextLine(); // Consumes the new line character..Agar isko nahi likhoge to ek size kam lega string me ar ek name kam print karayega like you want to prin three names but agar tumne ye nhii lagaya to wo kewal 2 names hi print karega islsiye ye lagao issse total jitte bhi names print karoge utte print kara dega ye
        System.out.println("Enter the Names Of an array according to your Size ");
        String names[]=new String[size];
        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();

        }
        System.out.println("These are the names Entered by the user ");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
           
        }
        sc.close();
    }
    
}
