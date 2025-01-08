import java.util.Scanner;

class CalculateSI {
    public static void main ( String []args ){
        Scanner sc = new Scanner(System.in);
        int Principal, Rate, Time;
        System.out.println("Enter the value of Principal: ");
        Principal = sc.nextInt();
        System.out.println("Enter the value of Rate: ");
        Rate = sc.nextInt();
        System.out.println("Enter the value of Time: ");
        Time = sc.nextInt();

        double SI = (Principal * Rate * Time)/100;
        System.out.println("SI : " + SI);
    }
}