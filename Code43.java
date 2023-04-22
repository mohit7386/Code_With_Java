import java.util.*;
public class Code43{
public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Number:-");
    int num=sc.nextInt();
    int revNum=0;
    int rem;
    int dummy=num; // Here we store the value of num into dummy for comparing the values
    while(num!=0){
        rem=num%10;
        revNum=revNum*10+rem;
        num=num/10; // Here after the checking all conditions and performing operations we got num=0 that's why we assign the value of num into dummy
    }
    System.out.println("The Value of num after checking all Conditions = "+num); // Here we have value of num which is zero that's why we are comparing the conditions that's why we are using dummy variable and put the value of num in dummy variable..So that's why we can easily compare the values..
    if(dummy==revNum) // Here the original value of num is stored in dummy now after comparison we get Palindrome Number 
    System.out.println("Palindrome Number ");
    else 
    System.out.println("Not a Palindrome Number ");
    sc.close();


}
}