import java.util.Scanner;

class Perimeterofarect {
    public static void main( String []args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Rectangle: ");
        int Length = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle: ");
        int Breadth = sc.nextInt();
        
        System.out.println("Perimeter of Rectangle is: ");
        System.out.println(2*(Length+Breadth));
    }
}