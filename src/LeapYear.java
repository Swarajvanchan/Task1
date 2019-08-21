/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        year=sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
            System.out.println("specified year is leap year");
        else
            System.out.println("specialized year is not a leap year");





    }

}
