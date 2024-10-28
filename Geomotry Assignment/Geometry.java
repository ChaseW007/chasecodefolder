import Java.util.Scanner;

public class Geometry {

    // Perimeter of a rectangle
    public void perimeter(double len, double wid) {
        
        double lenght = 6;
        double width = 4;

        double perimeter = 2 * (lenght + width);

        System.out.println("The perimeter of the rectangle is " + perimeter);
    }

    // Surface area of a cube
    public void surfaceArea(double side) {

        System.out.println("Enter any side length of a cube: ");
        length = nextfloat();

        SA = 6 * (length * length);

        System.out.println("The Surface area of a cube is" + SA);

     

    }

    // Area of a circle
    public void circleArea(double radius) {

        sc = new Scanner(System.in);	
		double radius, diameter, area, circumference;	

		System.out.print("Please Enter the Circle radius = ");
		radius = sc.nextDouble();	
	
		diameter = 2 * radius;
		area = Math.PI * radius * radius; 
		circumference = 2 * Math.PI * radius;

		System.out.println("\nArea of a Circle        = " + area);
		System.out.println("Diameter of a Circle      = " + diameter);
		System.out.println("Circumference of a Circle = " + circumference);

        
        
    }






}

