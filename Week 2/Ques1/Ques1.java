import java.util.Scanner;

public class Ques1
{ 
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int temp;
        int a[]=new int[100];
        while(n-- >0)
        {
        int num=ip.nextInt();
        int left=0;
        int right=num-1;
        temp=0;
        int index=0;
        for(int i=0;i<num;i++)
        {
            a[i]=ip.nextInt();
        }
        int key=ip.nextInt();
        while(left<=right)
        {
            int mid=left+((right-left)/2);
            if(a[mid]==key)
            {
                index=mid;
                temp=1;
                break;
            }
            else if(a[mid]>key)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
        if(temp==0)
        {
            System.out.println("key not found");
        }
        else 
        {
            int count=1;
            int left_side=index-1;
            while(left_side>=0 && a[left_side]==key)
            {
                count++;
                left_side--;
            }
            int right_side=index+1;
            while(right_side<num && a[right_side]==key)
        {
            count++;
            right_side++;
        }        
        System.out.println(count);
    }

    }
}
}