import java.util.Scanner;

/**
 * Diamond
 * 
 * prints diamond diagram based on users int input
 * my params/vaiable names are ugly
 */

public class Diamond {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the int: ");
            int star = sc.nextInt();
            
            Diamond d = new Diamond();
            d.printDiamond(star);
            sc.close();
        } catch (Exception e) {
            System.out.println("Int only ples");
        }
    } 

    private void printDiamond(int star) {
        top(star);
        middle(star);
        bottom(star);
    }
   
    
    public void top (int st) {
        for (int star = 0; star < st; star ++) {
            printStep(st - star, star);
        }
    }
    
    public void middle (int st) {
        printStep(0, st);
    }
    
    public void bottom (int st) {
        for (int star = st-1; star > 0; star --) {
            printStep(st - star, star);
        }
    }
    
    // actual printing line
    public void printStep(int space, int star) {
        String SPACE = " ";
        String STAR = "* ";
        String line = "";        

        for (int i = 0; i < space; i++){ line += SPACE; }
        for (int i = 0; i < star; i ++) { line += STAR; }
        System.out.println(line);
    }

}