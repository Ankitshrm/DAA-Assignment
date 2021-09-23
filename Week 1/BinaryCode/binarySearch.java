import java.util.Scanner;

public class binarySearch
{
    public static void main(String[] args) {
    Scanner ip =new Scanner(System.in);
    int n=ip.nextInt();
    int a[]=new int[100];
    int mid=0;
    int count;
    while(n-- >0)
    {
        int num=ip.nextInt();
        count=0;
        int index=0;
        for(int i=0;i<num;i++)
        {
            a[i]=ip.nextInt();
        }
        int key=ip.nextInt();
        int left=0;
        int right=num-1;
        while(left<=right)
        {
            mid=left+((right-left)/2);
            if(a[mid]==key)
            {
                count=1;
            }
            if(a[mid]>key)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
            index++;
        }
        if(count==1)
        {
            System.out.println("Present "+index);
        }
        else{
            System.out.println("not Present "+index);
        }
    }
    }
    
}



