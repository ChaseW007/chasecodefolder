import java.util.Scanner;
public class App {
        
        public static void main(String[] args) throws Exception {
            int speed, time;

            Scanner inputSpeed = new Scanner(System.in);
            System.out.println("Enter the car's speed (mph): ");
            speed = inputSpeed.nextInt();
    
            Scanner inputTime = new Scanner(System.in);
            System.out.println("Enter the time travelled (hours): ");
            time = inputTime.nextInt();

            inputSpeed.close();
            inputTime.close();

            displayResults( calcDistanceTravel(speed, time) );


        }


        public static int calcDistanceTravel (int s, int t) {
            int calc = s * t;
            return calc;
        }


        public static void displayResults (int milesDistance) {
            System.out.println("Distance Traveled (miles): " + milesDistance);
        }
}
