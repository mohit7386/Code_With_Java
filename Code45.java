import java.util.*;

public class Code45 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a positive integer: ");
			int num = sc.nextInt();
			int count=0;
			
			for (int i = 1; i <= num; i++) {
			    if (num % i == 0) {
			        count ++;
			    }
			}
			if(count>2){
			System.out.println(num + " is a composite number.");
			}
			else 
			System.out.println(num+ " is not a composite number ");
			sc.close();
		}
        
    }
    
}

