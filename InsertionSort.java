
package insertionsort;
import java.util.Scanner;

public class InsertionSort 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[]= new int[5];
        
        //step1 input
        System.out.println("enter the element ");
        for (int i =0 ; i<ar.length;i++)
        
        {
            ar[i]=sc.nextInt();
            
            
        }
        //step2 process
        for(int r=1 ; r<5 ; r++ )//pass
        {
            for(int c=0 ; c<r; c++)//comp
            {
                if(ar[c]>ar[r])//swap
                {
                    int temp = ar[c];
                    ar[c]=ar[r];
                    ar[r]=temp;
                }
            }
        }
        
        
        
        //step3 output
        
        System.out.println("----insertion sort ----");
        for (int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }

    
    public static void main(String[] args) 
    {
        InsertionSort obj = new InsertionSort();
        obj.func();
        
       
    }
    
}
