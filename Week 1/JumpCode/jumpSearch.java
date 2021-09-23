import java.util.Scanner;

public class jumpSearch
{
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int key;
        int a[]=new int[100];
        int search=0;
        while(n-- >0)
        {
            int num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
             key=ip.nextInt();
            int high= (int)Math.floor(Math.sqrt(n));
            int low =0;
            int count=0;
            while(a[high]<=key && high<num)
            {
                low=high;
                high+=(int)Math.floor(Math.sqrt(n));
            }
            for(int i=low;i<high;i++)
            {
                search++;
                if(a[i]==key)
                {
                    System.out.println("present "+search);
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("not present "+search);
            }
        }
    }
}