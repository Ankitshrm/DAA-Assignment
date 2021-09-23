import java.util.Scanner;

public class week_2_q3 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n,t,k;
        
        int a[]=new int [100];
        t=ip.nextInt();
        while(t-- >0)
        {
            
            n=ip.nextInt();
            for(int i=0;i<n;i++)
            {
                a[i]=ip.nextInt();
            }
            k=ip.nextInt();
            int c=1;
    
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n-i-1;j++)
                {
                    if(a[i]-a[j]==k||a[i]-a[j]==-k)
                    {
                        c++;
                    }
                }
            }
            System.out.println(c);
        }

    }
}
