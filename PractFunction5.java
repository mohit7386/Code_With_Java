import java.util.Scanner;
public class PractFunction5 {
    public static void countNumbers(int num) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
       
        while (true) {
           
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else if (num == 0) {
                zeroCount++;
            } else {
                break;
            }
        }
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (or 0 to stop): ");
        int num = sc.nextInt();
        countNumbers(num);
        sc.close();
    }
}
    

