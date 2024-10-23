import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Farenheit to Celsius (1) or Celsisus to Farenheit (2) ");
        int result = scan.nextInt();

        if (result == 1) {
            System.out.println("You have chosen Farenheit to Celsius!");
            System.out.println("Enter Farenheit value: ");
            double value = scan.nextDouble();
            double valuefinal = (value - 32) * 5/9; 
            System.out.println("Celsius is: ");
            System.out.println(Math.round(valuefinal*10.0)/10.0);
        }
        
        else if (result == 2) {
            System.out.println("You have chosen Celsius to Farenheit");
            System.out.println("Enter Celsius value: ");
            double value = scan.nextDouble();
            double valuefinal = (value + 32) * 5/9;
            System.out.println("Farenheit is: ");
            System.out.println(Math.round(valuefinal*10.0)/10.0);
        }
    }
}
