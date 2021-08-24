import java.util.Scanner;

public class week_0_linear_search
{
    public static void main(String[] args) {

        Scanner ip =new Scanner(System.in);
        System.out.println("Enter the limit of elements");
        int n =ip.nextInt();
        System.out.println("Enter the values of arrays");
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("Enter the search key value");
        int searchElement =ip.nextInt();
       int result =  LSearch(n,a,searchElement);
       if(result==-1)
       {
           System.out.println("Element not found");
       }
       else
       {
           System.out.println(searchElement+" is found at position "+result);
       }

       ip.close();

    }

    private static int LSearch(int n,int a[],int searchElement)
    {
        for(int i=0;i<n;i++)
        {
            if(searchElement==a[i])
            {
                return i +1;
            }
        }

        return -1;
    }
}