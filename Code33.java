import java.util.*;
public class Code33{

public static void main(String...args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers 1 and 2 and 3 and 4 and you will see your Robot perform things on the basis of the numbers you Entered:-");
    int num=sc.nextInt();
    switch (num){
        case 1:
        System.out.println("Namaste Sir or Mam");
        break;
        case 2:
        System.out.println("Gud Morning Sir or Mam");
        break;
        case 3:
        System.out.println("How are you?");
        break;
        case 4:
        System.out.println("Hey My name is Jarvis.... I am an A.I powered Robot and tell me about you?");
        default:
        sc.close();

    }

}
}
