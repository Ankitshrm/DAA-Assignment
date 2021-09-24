import java.util.Scanner;

public class Quick
{

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high]; 
        int i = (low - 1); 
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot) 
            {
                i++; 
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    private static void quickSort(int[] a, int low, int high)
    {
        if (low < high) 
        {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        Scanner ip =new Scanner(System.in);
        int n=ip.nextInt();
        int a[]=new int[100];
        while(n-- >0)
        {   
            int num =ip.nextInt();
            for(int i=0;i<num;i++)
            {
                a[i]=ip.nextInt();
            }
            quickSort(a, 0, num-1);
            int flag=0;
            for(int i=0;i<num-1;i++){
                if(a[i]==a[i+1])
                {
                    flag=1;
                    break;
                }
               
            }
            if(flag==1)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }


        }
    }
}