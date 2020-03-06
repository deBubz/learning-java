
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
            rain = InOut.nextDbl("");

            while (rain != -1) {
                total += rain;
                rain = InOut.nextDbl("Next: ");
            }
        } catch (Exception e) { System.out.println("Input Error " + e.toString()); }

        
        System.out.println("Total: " + total);
    } 
}