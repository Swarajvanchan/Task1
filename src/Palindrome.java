/**
 * Created by SWATHI on 8/21/2019.
 */
import java.util.Scanner;
public class Palindrome {
    public static boolean checkPalindrome(String str){
        if(str.length()==0||str.length()==1)
        return true;
        if(str.charAt(0)==str.charAt(str.length()-1))
            return checkPalindrome(str.substring(1, str.length()-1));
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String strInput=sc.nextLine();
        if(checkPalindrome(strInput))
        {
            System.out.println(strInput+ "is palindrome");
        }
        else
        {
            System.out.println(strInput+"not a palindrome");
        }
        sc.close();

    }
}
