//This is for Jenkins
import java.util.*;
public class sum
 {

    public static void main(String[] args)
    {        
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        b = sc.nextInt();
        
        System.out.println("Enter Second Number:");
        a = sc.nextInt();
        
        sc.close();
        sum = a+b;
        System.out.println("Sum of these numbers:"+sum);
    }
}