import java.util.Scanner;

public class Ques1
{ 
    private static int NoOfSearch(int []a,int l,int h,int key)
    {
        int counter=0;
        int index=0;
        if(h>=l)
        {
            int mid =l+(h-l)/2;
            if(key==a[mid])
            {
                counter++;
                index=mid;
                for(int c=index-1;c<h;)
                {
                    a[c]=a[c+1];
                    return NoOfSearch(a, l, h-1, key);
                }

                return counter;
               
                
            } 
        
            
            else if(a[mid]>key)
            {
                return NoOfSearch(a, key, l, mid-1);
            }
            else
            {
                return NoOfSearch(a, key, mid+1, h);
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        int key=ip.nextInt();
        int result=NoOfSearch(a,0,n-1,key);
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