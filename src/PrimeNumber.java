/**
 * Created by SWATHI on 8/21/2019.
 */
public class PrimeNumber {
    public static void main(String[] args){
        int i=0;
        int num=0;
        String primenumber="";
        for(i=1;i<=100;i++)
        {
            int counter=0;
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
                {
                    counter=counter+1;
                }
            }
            if(counter==2)
            {
                primenumber=primenumber+i+" ";
            }
        }
        System.out.println("primr numbers from 0 to 100");
        System.out.println(primenumber);
    }




}
