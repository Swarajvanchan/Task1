/**
 * Created by SWATHI on 8/22/2019.
 */
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        int c;
        Random t=new Random();
        for(c=1;c<=10;c++){
            System.out.println(t.nextInt(100));
        }
    }
}
