import java.util.Scanner;
public class gcd {
    public static int compGcd(int a ,int b){
        if(a==0){
            return b;
        }
        return compGcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
       int a=d.nextInt();
       int b=d.nextInt();
       System.out.println("the gcd of two numbers is : "+compGcd(a,b));
       d.close();

        
    }

    
}
