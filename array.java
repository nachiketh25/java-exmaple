import java.util.*;
public class array
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter the no of elements for our array");
    int x = sc.nextInt();
    int a[] = new int[x];
    System.out.print("Enter the elements for our array");
    for(int i=0;i<=x;i++)
    {
      System.out.println("Enter the elements" );
       a[i] = sc.nextInt();
    }
    System.out.println("The  content of array");
    for(int i=0;i<=x;i++)
    {System.out.println(a[i]);
    }
    sc.close();
  }
}