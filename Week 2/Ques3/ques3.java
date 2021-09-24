import java.util.Scanner;

public class ques3
{
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[100];
        while(n-- >0)
        {
            int num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            int key=ip.nextInt();
            int count=1;
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num-i-1;i++)
                {
                    if(a[i]-a[j]==key || a[i]-a[j]==-key){
                        count++;
                }
            }
            System.out.println(count);
        }
    }
    }
}