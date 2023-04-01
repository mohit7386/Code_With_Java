import java.util.*;
public class Code30
{
  public static void main (String[] args)
  {
    System.out.println("To Check the Given Input is Digit or Not");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a input");
    char ch = sc.next ().charAt (0);
     if(ch>='0' && ch<='9')
	 {
	  	System.out.println("Given Input is Digit.");
	 }
	 else
	 {
	  	System.out.println("Given Input is Not Digit.");
        sc.close();
	 }
  }
}