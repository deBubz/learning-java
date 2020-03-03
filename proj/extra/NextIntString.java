import java.util.*;

/**
 * testing Scanner nextInt()
 * string index out of range issue
 */

public class NextIntString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = 0;

		System.out.print("Enter something ");
		a = scan.nextInt();
		System.out.println("heyhey number " + a);
	}
}
