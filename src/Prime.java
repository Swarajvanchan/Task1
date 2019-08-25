/**
 * Created by SWATHI on 8/26/2019.
 */
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int temp;
        boolean prime=true ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        for(int i=2;i<=n/2;i++) {
            temp = n % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
            if(prime)
                System.out.println("prime number");
            else
                System.out.println("Not prime number");



    }

}

