import java.util.*;
public class Code35 {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number and any Alphabet:-");
        char ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='D'||ch>='a'&&ch<='d'){
            switch(ch){
                case 'A':
                case 'a':
                System.out.println("Enter the Radius of Circle for finding the area of the circle:-");
                double r=sc.nextDouble();
                double Area;
                Area=3.14*r*r;
                System.out.println("The Area of Circle is: " +Area);
                break;
                case 'B':
                case 'b':
                System.out.println("Hello Sir and Mam! How are you?");
                break;
                case 'C':
                case 'c':
                System.out.println("Enter the Month Number:-");
                int num=sc.nextInt();
                if(num>=1&&num<=12){
                switch (num){
                    case 1:
                    System.out.println("JANUARY");
                    break;
                    case 2:
                    System.out.println("FEBRUARY");
                    break;
                    case 3:
                    System.out.println("MARCH");
                    break;
                    case 4:
                    System.out.println("APRIL");
                    break;
                    case 5:
                    System.out.println("MAY");
                    break;
                    case 6:
                    System.out.println("JUNE");
                    break;
                    case 7:
                    System.out.println("JULY");
                    break;
                    case 8:
                    System.out.println("AUGUST");
                    break;
                    case 9:
                    System.out.println("SEPTEMBER");
                    break;
                    case 10:
                    System.out.println("OCTOBER");
                    break;
                    case 11:
                    System.out.println("NOVEMBER");
                    break;
                    case 12:
                    System.out.println("DEECEMBER");
                    break;
                    default:
                }
            } 
                
                else 
                System.out.println("Entered Number is greater then 12 please Enter the number 1 to 12");
                break;
   
                case 'D':
                case 'd':
                System.out.println("For finding the percentage of your marks then give me your Marks Obtained and total marks:-");
                System.out.println("Enter the marks obtained:-");
                double om=sc.nextInt();
                System.out.println("Enter the total marks:-");
                double tm=sc.nextInt();
                double percentage=om*100/tm;
                System.out.println("The percentage is "+percentage);
                break;
               
                }
                    
                }
                else 
                System.out.println("Wrong Choice Please Enter the character a to d");
                sc.close();

            }
        }

    

