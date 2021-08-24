import java.util.Scanner;

public class week_1_jump_search {
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ip.nextInt();
        }
        int key=ip.nextInt();
        int result=JSearch(a,n,key);
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
    

    private static int JSearch(int []a,int n,int key)
    {
        int step=(int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (a[Math.min(step, n)-1] < key)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
 
       
        while (a[prev] < key)
        {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
 
       
        if (a[prev] == key)
            return prev  ;
 
        return -1;
        
    }


}
