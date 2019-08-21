/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class ReverseNumber {
  //public static void main(String[] args){
      // int num=0;
       // int reversenum=0;
       // System.out.println("input your number");
       // Scanner in=new Scanner(System.in);
       // num=in.nextInt();
       /* while(num!=0)
        {
            reversenum=reversenum*10;
            reversenum=reversenum+num%10;
            num=num/10;
        }*/
      /* for(;num!=0;){
           reversenum=reversenum*10;
           reversenum=reversenum+num%10;
           num=num/10;

       }*/

    //    System.out.println("reverse of input number"+reversenum);


 //   }

//}
public static void reverseMethod(int number) {
    if (number < 10) {
        System.out.println(number);
        return;
    } else {
        System.out.print(number % 10);
        reverseMethod(number / 10);
    }

}
public static void main(String[] args) {
    int num = 0;
    System.out.println("INPUT YOUR NUMBER");
    Scanner in = new Scanner(System.in);
    num = in.nextInt();
    System.out.print("reverse input");
    reverseMethod(num);
    System.out.println();
}
}


