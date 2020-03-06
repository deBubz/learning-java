
/**
 * Rainfal
 * 
 * Prints total rainfall from a sequence of input
 */

public class Rainfal {
    public static void main(String[] args) {
        double rain = -1;
        double total = 0;

        try {
            System.out.print("Enter your rainfall data: ");

            while ((rain = InOut.nextDbl("Next: ")) != -1) {
                total += rain;
            }
        } catch (Exception e) { System.out.println("Input Error " + e.toString()); }

        
        System.out.println("Total: " + total);
    } 
}