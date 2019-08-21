/**
 * Created by SWATHI on 8/22/2019.
 */
import java.util.Scanner;
public class PerfectSquare {
    static boolean checkPerfectSquare(double x)
    {
        double sq=Math.sqrt(x);
        return((sq-Math.floor(sq))==0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        double num=sc.nextDouble();
        sc.close();
        if(checkPerfectSquare(num))
        System.out.print(num+"is a perfect square");
        else
        System.out.print(num+"is not a perfect square");

    }

}

