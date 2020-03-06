/**
 * NumberGroup
 * 
 * get a bunch of input then print the count of each number group (group by 20s)
 */
public class NumberGroup {
    public static void main(String[] args) {
        
        InOut.outln("NumberGrouper");
        int num = -1;
        int count20 = 0;
        int count40 = 0;
        int count60 = 0;

        try {
            num = InOut.nextInt("NextNum: ");
            while (num != -1) {
                if (num < 0) { InOut.outln("Too small"); }
                else if (num < 20) { count20++; }
                else if (num < 40) { count40++; }
                else if (num < 60) { count60++; }
                else { InOut.outln("Too big"); }

                num = InOut.nextInt("NextNum: ");
            }
        } catch (Exception e) { InOut.outln("Input Error " + e.toString()); }
        
        InOut.outln("\nResult");
        InOut.outln("Count20: " + count20);
        InOut.outln("Count40: " + count40);
        InOut.outln("Count60: " + count60);
    }
}