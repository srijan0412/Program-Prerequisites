import java.util.Scanner;
import java.lang.Math;

class Power {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Base: ");
        int Base = sc.nextInt();
        System.out.println("Enter Exponent: ");
        int Exponent = sc.nextInt();
        
        System.out.println("Value : ");
        System.out.println(Math.pow(Base, Exponent));
    }
}