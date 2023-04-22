import java.util.*;
public class Code36 {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name and it will print 50 times:-");
        String name=sc.nextLine();
        System.out.println("Your Name printing 50 times are below:-");
        for(int i=0;i<50;i++){
            System.out.println(name);
            sc.close();
        }
    }
    
}
