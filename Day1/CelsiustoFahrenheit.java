import java.util.Scanner;

class CelsiustoFahrenheit {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        int temp = sc.nextInt();
        
        System.out.println("Temperature in Fahrenheit : ");
        System.out.println((temp * 9/5) + 32);
    }
}