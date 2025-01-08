import java.util.Scanner;

class KmtoMiles {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Kilometers: ");
        int Km = sc.nextInt();
        
        System.out.println("Value : ");
        System.out.println(Km * 0.621371);
    }
}