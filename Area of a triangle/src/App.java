import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //taking input from user
        System.out.println("Enter the length for the two sides");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Enter the angle");
        double c = input.nextDouble();

        //calculating angle 
        double angle = Math.toRadians(c);

        //calculate area
        double areaofTriangle = 0.5* (a*b) * Math.sin(angle);

        System.out.println("Area of Traiangle is" + areaofTriangle);

        
    }
}
