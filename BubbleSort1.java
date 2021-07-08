
package bubblesort1;
import java.util.Scanner;

public class BubbleSort1 
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
        for(int r=0 ; r<4 ; r++ )
        {
            for(int c=0 ; c<4-r; c++)
            {
                if(ar[c]>ar[c+1])
                {
                    int temp = ar[c];
                    ar[c]=ar[c+1];
                    ar[c+1]=temp;
                }
            }
        }
        
        
        
        //step3 output
        
        System.out.println("----bubble sort ----");
        for (int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
    
    
    public static void main(String[] args)
    {
        BubbleSort1 obj = new BubbleSort1();
        obj.func();
    }
    
}
