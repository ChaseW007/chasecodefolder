import java.util.Scanner;
public class App {
    //declare varaiable 
    static int speed;
    static int time;
        int traveled;
        public static void main(String[] args) throws Exception {
      
            Scanner inputSpeed = new Scanner(System.in);
            System.out.println("Enter the car's speed (mph): ");
            speed = inputSpeed.nextInt();
    
            Scanner inputTime = new Scanner(System.in);
            System.out.println("Enter the time travelled (hours): ");
            time = inputTime.nextInt();

            inputSpeed.close();
            inputTime.close();
        }


        int calcDistanceTravel (int speed, int time) {
            traveled = speed * time;
            return traveled;
        }


        void displayResults (int milesDistance) {
            System.out.println("Distance Traveled (miles): " + milesDistance);
        }
}
