import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x,k;
        x=sc.nextInt();
        
        int a[]=new int[x];
        System.out.println("enter the elements of the array:");
        for(int i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        for( k=0;k<x-1;k++)
        {
            for(int j=0;j<x-k-1;j++)

            {
                if (a[j] > a[j+1]) {
                    int  temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            
            
        
       
        }
        System.out.println("the sorted array"+a[k]);
        
        
         


    }
    
}
