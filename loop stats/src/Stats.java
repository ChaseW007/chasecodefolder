

public class Stats {
    public static int even(int Number1, int Number2) {
        int evencount = 0;
        for (int x = Number1; x <= Number2; x++) {
            if (x % 2 != 0) {
                evencount++;
            }
            return evencount;
        }
                return evencount;
    }
    public static int odd(int Number1, int Number2) {
        int oddcount = 0;
        for (int x = Number1; x <= Number2; x++) {
            if (x % 2 != 0){
                oddcount++;
            }
            return oddcount;
        }
                return oddcount;
    }
    public static int total(int Number1, int Number2) {
        int total = 0;
        for (int x = Number1; x <= Number2; x++){
            total = total + x;
        }
        return total;
    }
    public static int Print(int Number1, int Number2){
        System.out.println("Number of evens: " + even(Number1, Number2));
        System.out.println("Number of odds: " + odd(Number1, Number2));
        System.out.println("Total: " + total(Number1, Number2));
            return Number2;
    }
}
