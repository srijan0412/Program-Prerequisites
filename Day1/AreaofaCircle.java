import java.util.Scanner;

class AreaofaCircle {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        int radius = sc.nextInt();
        
        double area = (22.0/7.0) * radius * radius;
        System.out.println("Area of the circle: ");
        System.out.println(area);
    }
}