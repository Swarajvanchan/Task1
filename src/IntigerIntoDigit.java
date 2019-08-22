/**
 * Created by SWATHI on 8/22/2019.
 */
import java.util.Scanner;
public class IntigerIntoDigit {
    public static void main(String[] args){
        int num,temp,digit,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        temp=num;
        sc.close();
        while(num>0)
        {
            num=num/10;
            count++;
        }
        while(temp>0){
            digit=temp%10;
            System.out.println("digit at place"+count+"is"+digit);
            temp=temp/10;
            count--;
        }
    }


}
