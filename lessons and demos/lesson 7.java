public class App {
    public static void main(String[] args) throws Exception {
        //String message1 = "That was great - lol!";
        //String target1 = "lol";

        //int pos = message1.indexOf(target1);
        //String output = message1.substring(0, pos) + "Laugh out loud!";
        //System.out.println(output);


        String message2 = "I am very happy";
        String target2 = "very";

        int pos = message2.indexOf(target2);
        int pos2 = pos + target2.length();
        String output = message2.substring(0, pos) + message2.substring(pos2);
        System.out.println(output);
    }
}

