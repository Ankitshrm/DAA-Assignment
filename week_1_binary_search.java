import java.util.Scanner;


public class week_1_binary_search {
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
       int result =  BSearch(a,searchElement,0,n-1);
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

    private static int  BSearch(int a[],int key,int l,int h)
    {
        if(h>=l)
        {
            int mid =l+(h-l)/2;
            if(key==a[mid])
                return mid +1;
            else if(a[mid]>key)
            {
                return BSearch(a, key, l, mid-1);
            }
            else
            {
                return BSearch(a, key, mid+1, h);
            }
        }
       

        return -1;
    }
}
