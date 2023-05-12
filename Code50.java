import java.util.*;
public class Code50 {
    public static void main(String...args){
        System.out.println("Enter the Coefficients of the Quadratic Equation:-");
        Scanner sc =new Scanner(System.in);
        System.out.println("a =");
        double a=sc.nextDouble();
        System.out.println("b =");
        double b=sc.nextDouble();
        System.out.println("c =");
        double c=sc.nextDouble();
        double discriminant=b*b-4*a*c;

        if(discriminant>0){
            double root1=(-b+(Math.sqrt(discriminant))/(2*a));
            double root2=(-b-(Math.sqrt(discriminant))/(2*a));
            System.out.println("The roots of the Quadratic Equations are :-");
            System.out.println("Root 1 : "+root1);
            System.out.println("Root 2 : "+root2);
        }
        else if(discriminant==0){
            double root=-b/(2*a);
            System.out.println("The root of the quadratic equation is:-");
            System.out.println("Root : "+root);
        }
        else {
            System.out.println("There are no Roots for the Quadratic Equations");
          
        }
        sc.close();

    }
    
}
