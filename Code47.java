import java.util.*;
public class Code47 {
    public static void main(String...args){
        System.out.println("Which number of table you want?");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(" ");
        int table=0;
        System.out.println("Table of " +num+ " is: \n");
        for(int i=1;i<=10;i++){
            table=num*i;
            System.out.println(+num+ " * " + i + " = "+table);
            sc.close();

        }
       
       

    
}
}
