import java.util.Scanner;

/**
 * In
 * 
 * Handling input
 */
public class InOut {
    public static Scanner sc = new Scanner(System.in);

    /// out
    public static void out(String s) { System.out.print(s); }
    public static void outln(String s) { System.out.println(s); }


    /// In

    public static int nextInt(){
        return 0;
    }

    public static int nextInt(String prompt){
        System.out.print(prompt);
        int i = sc.nextInt();
        
        return i;
    }
    
    public static double nextDbl(String prompt){
        System.out.print(prompt);
        double i = sc.nextInt();
        
        return i;
    }
     
}