import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        int pos=0,neg=0,zero=0,n;
        Scanner sc=new Scanner(System.in);
    
        char opt='Y'; 
     
        while(opt=='y'||opt=='Y') 
        { 
        
            System.out.println("Enter the number: "); 
            n=sc.nextInt(); 
            if(n==0) 
                ++zero; 
            else if(n>0) 
                ++pos; 
            else if(n<0) 
                ++neg; 
            System.out.println("Enter 'Y' if you wish to continue else enter 'N'!"); 
            opt=sc.next().charAt(0);
        }
       
        System.out.println("Negative Entries: "+neg); 
        System.out.println("Positive Entries: "+pos); 
        System.out.println("Zero Entries: "+zero); 
        sc.close();  
    }
    
}
