import java.util.*;
public class Code29
{
    public static void main(String[] args) {
        int year;
        System.out.println("Program to find Which year is a leap year" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Year in input:");
        year= sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Given year "+ year +" is a leap year.");
        }
        else if (year % 100 == 0) {
            System.out.println("Given year "+ year +" is not a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println("Given year "+ year +" is a leap year.");
        }
        else {
            System.out.println("Given year "+ year +" is not a leap year.");
            sc.close();
        }
    }
}