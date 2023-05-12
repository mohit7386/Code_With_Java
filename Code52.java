import java.util.*;
public class Code52 {
    public static void main(String...args){
        System.out.println("Enter any number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        do{
            System.out.println(num);
            num+=1;
        }
        while(num<15);
        sc.close();
       

    }
    
    
}

