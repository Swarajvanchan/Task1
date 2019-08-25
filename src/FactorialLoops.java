/**
 * Created by SWATHI on 8/25/2019.
 */
import java.util.Scanner;
public class FactorialLoops {
    public static void main(String[] args) {
        int fact=1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact* i;


        }
        System.out.print("factorial of " + n + "is" + fact);
    }
}
