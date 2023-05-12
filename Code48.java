import java.util.*;
public class Code48 {
    public static void main(String...args){
        System.out.println("Enter any number for cube:-");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt(); 
    int cube= (int)Math.pow(num,3);
    System.out.println("THe Cube of " +num+ " is : "+cube);
    System.out.println("----------------------------------------");
        System.out.println("Enter the number for square:-");
            int num2=sc.nextInt();
            int square=(int)Math.pow(num2,2);
    System.out.println("The Square of " +num2+ " is :" +square);
    sc.close();
    

    
}
}
