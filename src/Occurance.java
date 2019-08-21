/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class Occurance {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=null;
        System.out.println("enter a string");
        str=s.nextLine();
        int[] count=new int[255];
        int length=str.length();
        for(int i=0;i<length;i++) {
            count[str.charAt(i)]++;
        }
        char[] ch=new char[str.length()];
        for(int i=0;i<length;i++){
            ch[i]=str.charAt(i);
            int find=0;
            for(int j=0;j<=i;j++) {
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if(find==1){
                System.out.println("number of occurence"+str.charAt(i)+"letter is:"+count[str.charAt(i)]);

            }

        }
    }
}
