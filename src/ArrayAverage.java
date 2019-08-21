/**
 * Created by SWATHI on 8/18/2019.
 */
import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        System.out.println("how many numbers do you want to enter");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            double[] arr=new double[n];
        double total=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("enter element no"+(i+1)+": ");
            arr[i]=sc.nextDouble();
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
            total=total+arr[i];
        }
        double average=total/arr.length;
        System.out.format("the average is %3f",average);
    }
}
