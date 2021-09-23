import java.util.Scanner;

public class binarySearch
{

    private static int Bsearch(int a[],int l,int h,int key)
{
    if(h>=l)
    {
        int mid=l+(h-l)/2;
        if(a[mid]==key)
            return mid;
        else if(a[mid]>key)
            return Bsearch(a, l, mid-1, key);
        else 
            return Bsearch(a, mid+1, h, key);
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
        int result=Bsearch(a,0,n-1,key);
        if(result==-1)
            System.out.println("Element not found");
        else 
            System.out.println(result);
        
        ip.close();
    }
}



