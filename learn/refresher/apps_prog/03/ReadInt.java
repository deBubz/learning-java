/**
 * ReadInt
 * Input Integer to be converted to string
 */

// do 0 - 20 handle teens
// do 30
// do up to 101
public class ReadInt {
    static String[] tens = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] hundreds = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    // lets go
    public static void main(String[] args) {
        
        
        Integer input = InOut.nextInt("Enter a number: ");

        while (input != -1) {
            if (input < 0) { InOut.outln("Too Small"); }
            else if (input < 20) { InOut.outln(print10s(input)); }
            else if (input < 100) { InOut.outln(print100s(input)); }
            else if (input < 1000) { InOut.outln(print1000s(input)); }
            else { InOut.outln("Too big"); }

            input = InOut.nextInt("Enter a number: ");
        }
    }

    // 0 - 19
    public static String print10s(int i) {
        return tens[i];
    }

    // 20 - 99
    public static String print100s(int i) {
        int t = (i/10) - 2; int d = i%10; String msg = "";

        if (d == 0) { msg = hundreds[t]; }
        else msg = hundreds[t] + " " + tens[d];

        return msg;
    }

    // 100 - 999
    public static String print1000s(int i) {
        int h = (i/100); int td = i%100;
        String msg = "";

        if(td == 0) { msg = tens[h] + " hundred"; }
        else if (td < 20) { msg = tens[h] + " hundred and " + print10s(td); }
        else { msg = tens[h] + " hundred and " + print100s(td); }

        return msg;
    
    
}