/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class ReverseString {
    public static String reverseTheSentence(String inputString)
    {
        String[] words=inputString.split("\\s");
        String outputString=" ";
        for(int i=words.length-1;i>=0;i--)
        {
            outputString=outputString+words[i]+" ";
        }
        return outputString;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the input string ");
        String inputString=sc.nextLine();
        String outputString=reverseTheSentence(inputString);
        System.out.println("inputString:"+inputString);
        System.out.println("output String:"+outputString);


    }

}
