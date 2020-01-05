package bubz;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat mFormat = new SimpleDateFormat("MM");
        SimpleDateFormat dFormat = new SimpleDateFormat("DD");
        SimpleDateFormat yFormat = new SimpleDateFormat("yyyy");
        int currMonth = Integer.parseInt(mFormat.format(date));
        int currDay = Integer.parseInt(dFormat.format(date));
        int currYear = Integer.parseInt(yFormat.format(date));

        boolean mGate, dGate;

        if(currMonth > 1) {
            System.out.println("Its not NY yet, next year(" + (currYear + 1) + ") is in" + (12 - currMonth) + " months.");
        }
        else {
            System.out.println("Did you say goobye to " + (currYear - 1));
            System.out.println("Happy " + currYear + ", enjoy it its only " + currDay + " days into the year.");
        }
    }
}
