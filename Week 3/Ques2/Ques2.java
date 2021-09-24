import java.util.Collections;
import java.util.Scanner;

public class Ques2
{
    private static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int [100];
        while(n-- >0)
        {
            int num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            int mid=0;
            int comparison=0,swaps=0;
            for(int i=0;i<num-1;i++){
                mid=i;
                for(int j=i+1;j<n;j++){
                    if(a[j]<a[mid]){
                        mid=j;
                    }
                    comparison++;
                }
                swap(a[mid],a[i]);
                swaps++;
            }
            for(int i=0;i<num;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("comparisons "+comparison);
            System.out.println("Swaps "+swaps);
        }
    }
}