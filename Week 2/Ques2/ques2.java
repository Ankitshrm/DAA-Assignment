import java.util.Scanner;

public class ques2
{
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [100];
        boolean flag=false;
        int iFinal=0 ,jFinal=0,kFinal=0;
        while(n-- >0)
        {
            int num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num-i-1;j++)
                {
                    int sum=0;
                    sum+=a[i]+a[j];
                    for(int k=0;k<num;k++)
                    {
                        iFinal=i+1;
                        jFinal=j+1;
                        kFinal=k+1;
                        flag=true;
                    }
                }
        
            }
            if(flag==true)
            {
                System.out.println(iFinal+"\t"+jFinal+"\t"+kFinal);
            }else{
                System.out.println("No Sequence");
            }
        }
        
    }
}