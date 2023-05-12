import java.util.*;
public class Pattern3 {
    public static void main(String...args){
        System.out.println("Enter how many alphabetical rows you want to print in your solid star pattern :-");
        Scanner sc=new Scanner(System.in);
        char row=sc.next().charAt(0);
        System.out.println("Here is the result of your Solid Star Pattern:-");
        for(char i='A';i<=row;i++){ //This is our Inner Loop for printing and counting the rows of our pattern
            for(char j='A';j<=row;j++){ //This is our Outer Loop for printing and counting the Columns of our pattern
                System.out.print(i);
            }
            System.out.println();
           
        }
        System.out.println();
        System.out.println("Another Pattern Program");
        for(int k=1;k<=5;k++){ //This is our Inner Loop for printing and counting the rows of our pattern
            for(int l=1;l<=5;l++){ //This is our Outer Loop for printing and counting the Columns of our pattern
                System.out.print(l);
            }
            System.out.println();
            sc.close();



        }
    }
}
    


    

