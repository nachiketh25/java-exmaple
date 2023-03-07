import java.util.Scanner;
import java.lang.Math;
public class power {
    public static float calcPower(float x, float n){
        double Pow =Math.pow(x,n);
        System.out.println("the power is: "+Pow);
        return (float) Pow;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float x, n;
        x=sc.nextFloat();
        n=sc.nextFloat();
        calcPower(x,n);
        sc.close();
        

    }
}
