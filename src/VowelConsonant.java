/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.print("entered charecter is vowel");
        }
            else
        {
            System.out.print("entered charecter is consonent");
        }


    }
}
