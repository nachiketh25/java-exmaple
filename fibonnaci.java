import java.util.Scanner;
public class fibonnaci {
    public static int fiBo(int n){
        int sum =0;
        System.out.println(sum);
        sum=1;
        System.out.println(sum);
        for (int i=0;i<n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("the fibbonaci series is:"+fiBo(n));
        
        sc.close();
    }


    
}
