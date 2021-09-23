import java.util.Scanner;

public class week_2_q2 {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[100];
        int flag=0;
        int i_inx=0;
        int j_inx=0;
        int k_inx=0;
        int num;

        while(n-- >0)
        {
             num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            for(int i=0;i<num-1;i++)
            {
                for(int j=i+1;j<num-i-1;j++)
                {
                    int sum=0;
                    sum+=a[i]+a[j];
                    for(int k=0;k<num;k++)
                    {
                        if(sum==a[k])
                        {
                            i_inx=i+1;
                            j_inx=j+1;
                            k_inx=k+1;
                            flag=1;
                        }
                    }
                }
            }
            if(flag==1)
            {
                System.out.println(i_inx+"\t"+j_inx+"\t"+k_inx);
            }
            else
            {
                System.out.println("No Sequence Found");
            }
        }
        
    }
}
