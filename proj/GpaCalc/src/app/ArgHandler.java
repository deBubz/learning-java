package app;

/**
 * ArgHandler
 * to handle arguements manually
 */
public class ArgHandler {
    private String[] args;

    public ArgHandler() {};
    public ArgHandler(String[] args) {
        this.args = args;
    }
    
    public boolean checkArgs(){
        if(args.length == 6){
            for(int i = 1; i < 6; i ++) {
                if(!tryParse(args[i])) return false;
            }
            return true;
        } 
        else return false;
    }

    public boolean tryParse(String s) {
        try {
            Integer.parseInt(s);
            return true;    
        } 
        catch (NumberFormatException e) {
            return false;
        }
        
    }

    public void help(){
        System.out.println("This is a simple cli program to calculate your GPA");
        System.out.println("This app can be used by just launching it by itself or with -f / --fast for Fast mode");
        System.out.println("Use Fast mode in this format");
        System.out.println("GPACalc [-f/--fast] [HDcount] [Dcount] [Ccount] [Pcount] [Fcount]");
        System.exit(0);
    }
}