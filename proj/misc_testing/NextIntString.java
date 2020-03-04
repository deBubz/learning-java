import java.util.*;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

/**
 * testing Scanner nextInt()
 * string index out of range issue
 * Some testing on try catch exeption
 */

public class NextIntString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = 0;

		System.out.print("Enter something ");
		try {
			a = scan.nextInt();
			// a = "a";
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		System.out.println(a);

		scan.close();
	}
}
