/**
 * AvgDayPMonth
 */
public class AvgDayPMonth {
    // Assuming non leap year
    static int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int count = 0;
    static int tDay = 0;

    public static void main(String[] args) {
        for ( int day: dayInMonth) {
            count++;
            tDay += day;
        }

        System.out.println("Avg Day per Month: " + (double)tDay/count);
        System.out.println("Avg Day per Month(leap year): " + (double)(tDay + 1)/count);
    }
}