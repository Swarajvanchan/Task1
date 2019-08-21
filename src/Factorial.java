/**
 * Created by SWATHI on 8/21/2019.
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int factorial=fact(num);
        System.out.println("factorial of number is"+factorial);
    }
    static int fact(int n){
        if(n==1)
        {
            return 1;
        }
        int output=fact(n-1)*n;
        return output;
    }

}
