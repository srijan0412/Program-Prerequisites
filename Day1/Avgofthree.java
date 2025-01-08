import java.util.Scanner;

class Avgofthree {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int Num2 = sc.nextInt();
        System.out.println("Enter Num3: ");
        int Num3 = sc.nextInt();
        
        System.out.println("Average : ");
        System.out.println((Num1 + Num2 + Num3)/3.0);
    }
}