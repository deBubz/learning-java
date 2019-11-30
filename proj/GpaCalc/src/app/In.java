package app;

import java.util.*;

/**
 * In class provides static method for reading inputs from STDIN
 * 
 * String nextLine()
 * int nextInt()
 * char nextChar()
 */
public class In {
    private static final Scanner scan = new Scanner(System.in);

    private In() {}
    
    // read nextline of String
    public static String nextLine() {
        return scan.nextLine();
    }

    // read next line as int
    public static int nextInt() {
       return scan.nextInt();
    }

    // read first char of next line
    public static char nextChar() {
       return scan.nextLine().charAt(0);
    }
}