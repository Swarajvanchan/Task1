/**
 * Created by SWATHI on 8/21/2019.
 */
import java.util.Scanner;
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String str;
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        sc.close();
        String reversed=reverseString(str);
        System.out.println("the reverse string is:"+reversed);
    }
    public static String reverseString(String str){
        if(str.isEmpty())
            return str;
        return reverseString(str.substring(1))+str.charAt(0);
    }

}
