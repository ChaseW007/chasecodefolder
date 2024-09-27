import static java.lang.System.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //Scanner keys = new Scanner(System.in);
        //System.out.print("How mnay wings do you want?");
        //int num = keys.nextInt();
        //System.out.println("Your Total will be $" + (num * 0.75) );

        Scanner keys = new Scanner(System.in);
        System.out.print("How many wings would you like?");
        int num = keys.nextInt();
        System.out.println("Your total will be $" + (num/0.75) );

        
    }
}
