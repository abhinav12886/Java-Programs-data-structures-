
package selectionsort1;

import java.util.Scanner;

public class SelectionSort1 
{
    
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar []= new int[5];
        
        //step 1 input
        System.out.println("enter the element in array");
        for (int i =0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        
        //step 2 process 
        for(int r=0 ; r<4 ; r++ )
        {
            for(int c=r ; c<=4; c++)
            {
                if(ar[r]>ar[c])
                {
                    int temp = ar[r];
                    ar[r]=ar[c];
                    ar[c]=temp;
                }
            }
        }
        
        
        
        //step3 output
        System.out.println("-----Selection sort -----");
        for (int i =0;i< ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        
        
    }

    
    public static void main(String[] args)
    {
        SelectionSort1 obj = new SelectionSort1();
        obj.func();
    }
    
}
