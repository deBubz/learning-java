import java.util.Scanner;

public class ScannerInput {
    
    static Scanner scan = new Scanner(System.in);
    
    public static String nextString(){
        return scan.next();
    }

    public static int nextInt() {
        return scan.nextInt();
    }
}