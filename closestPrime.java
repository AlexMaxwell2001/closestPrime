import java.util.*;
public class closestPrime 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int num= Integer.parseInt(sc.nextLine());
        int lowestPrime=0;
        int highestPrime=0;
        int finalPrime = 0;
        for(int i=num;i<num+100;i++)
        {
            int count1=0;
            for(int j=2; j<Math.sqrt(num);j++)
            {
                if(i%j==0)
                {
                    count1++;
                }
            }
            if(count1<1)
            {
                highestPrime = i;
                break;
            }
        }
        for(int i=num;i>num-100;i--)
        {
            int count2=0;
            for(int j=2; j<Math.sqrt(num);j++)
            {
                if(i%j==0)
                {
                    count2++;
                }
            }
            if(count2<1)
            {
                lowestPrime = i;
                break;
            }
        }
       
        if((Math.abs(lowestPrime-num))>(Math.abs(highestPrime-num)))
        {
            finalPrime=highestPrime;
        }
        else
        {
            finalPrime=lowestPrime;
        }
        System.out.println(finalPrime);
    }
}