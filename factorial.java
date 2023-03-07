import java.util.*;
public class factorial {
    public static void calFactorial(int n){
        if(n<0){
            System.out.println("the given no is invalid");
        }
        else{
        int fact =1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        

        }
        System.out.println("the factorial of the number n is: "+fact);
        return;

    }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calFactorial(n);
        sc.close();

        
    }
    
}
