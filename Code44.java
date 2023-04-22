import java.util.*;
public class Code44 {
    public static void main(String...args){
        System.out.println("Enter any Number:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dummy=num;
        int arm=0;
        int rem;
        while(num!=0){
            rem=num%10;
            arm=rem*rem*rem+arm;
            num=num/10;
        }
    if(arm==dummy)// Here we Assign the value of  num into dummy because the value of num till now is 0 so when we compare the value without assigning the value in dummy we got a zero in output that's we assign the value of num into dummy 
    System.out.println("Armstrong number");
    else 
    System.out.println("Not a Armstrong Number");
    sc.close();
    
    
}
}
