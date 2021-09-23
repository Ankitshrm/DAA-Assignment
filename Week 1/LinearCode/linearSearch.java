import java.util.Scanner;

public class linearSearch
{

    private static int LSearch(int []a,int n,int key)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        int key=ip.nextInt();
        int result=LSearch(a,n,key);
        if(result==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println(result);
        }
        ip.close();
    }
}

