/**
 * Created by SWATHI on 8/25/2019.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int count=7,num1=0,num2=1;
        System.out.println("fibonacy series of"+count+"number");
        int i=1;
        while(i<=count)
        {
            System.out.println(num1+"");
            int total=num1+num2;
            num1=num2;
            num2=total;
            i++;
        }

    }
}
