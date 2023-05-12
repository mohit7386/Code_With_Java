import java.util.*;
public class Code56 
{  
public static void main(String[] args)   
{   
System.out.println("Enter the First number:-");
Scanner sc=new Scanner(System.in);
int gcd=0;
int num1=sc.nextInt();
System.out.println("Enter the Second number:-");
int num2=sc.nextInt();
for(int i = 1; i <= num1 && i <= num2; i++)  
{    
if(num1%i==0 && num2%i==0)  
gcd=i;
}  
System.out.printf("GCD of %d and %d is: %d", num1,num2,gcd);  
sc.close();
}  
}  