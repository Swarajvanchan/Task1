/**
 * Created by SWATHI on 8/23/2019.
 */
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        int i,first,last,middle,n,search,array[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        array=new int[n];
        System.out.println("enter"+n+"integers");
        for (i=0;i<n;i++)
            array[i]=sc.nextInt();
        System.out.println("enter the value to find");
        search=sc.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        while(first<=last){
            if(array[middle]<search)
                first=middle+1;
            else if(array[middle]==search)
            {
                System.out.println(search+"found at location"+(middle+1)+".");
                break;

            }
            else
                last=middle-1;
            middle=(first+last)/2;

        }
        if(first>last)
            System.out.println(search+"isnt present in the list");
    }
}
