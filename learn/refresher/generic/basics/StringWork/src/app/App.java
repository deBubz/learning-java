package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);


        String input = scan.next();
        String upper = input.toUpperCase();
        int userNumber = scan.nextInt();

        char first = input.charAt(0);

        System.out.println("Input " + input);
        System.out.println("Upper " + upper);
        System.out.println("First " + first);   

        scan.close();
    }
}