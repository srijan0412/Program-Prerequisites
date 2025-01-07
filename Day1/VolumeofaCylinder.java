import java.util.Scanner;

class VolumeofaCylinder {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of the Cylinder: ");
        int radius = sc.nextInt();
        System.out.println("Enter height of the Cylinder: ");
        int height = sc.nextInt();
        
        double volume = (22.0/7.0) * radius * radius * height;
        System.out.println("Volume of the cylinder: ");
        System.out.println(volume);
    }
}