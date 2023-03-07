import java.util.*;

public class Complex {
    double real, img;

    public Complex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real value of the complex number: ");
        real = sc.nextDouble();
        System.out.println("Enter the imaginary value of the complex number: ");
        img = sc.nextDouble();
        sc.close();
    }

    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.img = this.img + c.img;
        return result;
    }

    public double absolute() {
        return Math.sqrt(real * real + img * img);
    }

    public Complex multiply(Complex c) {
        Complex result = new Complex();
        result.real = this.real * c.real - this.img * c.img;
        result.img = this.real * c.img + this.img * c.real;
        return result;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex();
        System.out.println("Absolute value of complex number 1: " + c1.absolute());
        Complex c2 = new Complex();
        System.out.println("Absolute value of complex number 2: " + c2.absolute());
        Complex sum = c1.add(c2);
        System.out.println("Sum of the complex numbers: " + sum.real + "+" + sum.img + "i");
        Complex product = c1.multiply(c2);
        System.out.println("Product of the complex numbers: " + product.real + "+" + product.img + "i");
        
       
    }
}
