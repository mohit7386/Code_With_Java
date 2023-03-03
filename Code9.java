public class Code9 {
    public static void main(String...args){
        int a=10;
        int b= 5;
        int c= 7;//Here assignment operator work the value 7 is assigned to the variable c with the help oof equals sign this sign is assignment operatoe and it's execution is right to left...
        System.out.println("Relational operator Checking relation with the values");
        System.out.println(a>b);
        System.out.println(c>a);
        System.out.println("Logical AND");
        System.out.println(a>b&&c>a);  // here in logical AND we need to true both the values for the true Statement. if any of the value gives false statement so the condition is executed than it doesnot matter the rest of the value gives true statement it doesnot matter the whole statement will be False.....
        System.out.println(a>b&&c>b);
        System.out.println(a<b&&a++<c);
        System.out.println("Bitwise AND");
        System.out.println(a<b&a++>c); // Here is the major difference between the logical AND and Bitwise AND In logical AND when the one value gives true and it stops to check the another condition and shows the result on the basis of first condition But In Bitwise AND it also checks the second value but the result is same as Logical AND....
        System.out.println(a);
        a--;
        System.out.println("Logical OR");
        System.out.println(a>c||c>b);
        System.out.println(a>b||b>c); //Here in logical OR we don't need for both the values is true if anyone of the value is true then the result is will be true...
        // In Bitwise (AND , OR) second condition is also checked but in Logical (OR , AND) it doesn't check the second value after checking the first condition....  
        System.out.println("Ternary Operator");  
        System.out.println((a<b)?a:b); // Question mark denotes the Ternary Operator..
        System.out.println("Assignment Operator");
        a+=4;//a=a+4 (a=10+4) Execution is right to left 
        b-=4;//b=b-4 (b=20-4)  
        System.out.println(a);  
        System.out.println(b); 
        
    }
    
}
