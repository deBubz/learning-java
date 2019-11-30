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
    public static String nextLine(String s) {
        System.out.print(s);
        return scan.nextLine();
    }


    // read next line as int
    public static int nextInt() {
       return scan.nextInt();
    }
    public static int nextInt(String s) {
        System.out.print(s);
        return scan.nextInt();
    }


    // read first char of next line
    public static char nextChar() {
       return scan.nextLine().charAt(0);
    }
    public static char nextChar(String s) {
        System.out.print(s);
       return scan.nextLine().charAt(0);
    }


}