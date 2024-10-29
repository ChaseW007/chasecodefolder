public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 3;
        while (num > 0) {
            System.out.println(num);
            num--;
            //num =num - 1; same as ^
        }

        //game loop
        boolean game = true; //trigger
        while (game) {
            //program code or game code or calculations
            System.out.println("Hello Universe");

            //kill switch, play again
            System.out.println("Do you want to play again:");
            String userinput = "no"; //getting use responce

            if (userinput.equals("no")); {
                game = false; //trigger game to end
            }


        }

    }
}
