import java.util.Scanner;

public class Ques1_Selection
{
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[100];
        while(n-- >0)
        {
            int num=ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            int shifts=0,comparison=0;
            int key=0,j;
            for(int i=1;i<num;i++){
                key=a[i];
                j=i-1;
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j--;
                    shifts++;
                    comparison++;
                }
                a[j+1]=key;
                comparison++;
            }
            for(int i=0;i<num;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("Shift "+shifts);
            System.out.println("Comparisons "+comparison);
        }

    }
   
}