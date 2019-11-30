package app;

public class App {
    public static void main(String[] args) throws Exception {
        new App().use();
    }

    public App(){}

    public void use(){
        System.out.println("Eya Time to convert some units");
        System.out.println("==============================\n");

        char c;
        while((c = menuPrompt()) != 'x') {
            switch(c){
                case '1':   optionA();      break;
                case '2':   optionB();      break;
                default:
                    System.out.println("Invalid Selection try again");    
                break;
            }
        }
        System.out.println("Terminating");
    }

    public char menuPrompt() {
        System.out.print("Please select your options\n" +
            "1. Option A\n" +
            "2. Option B\n" +
            "x. Close Application\n");
        return In.nextChar("Pick your choice: ");
    }

    private void optionB() {
        System.out.println("You Picke BBBBB");
    }

    private void optionA() {
        System.out.println("You Picke AAAA");
    }

    // private static char getChoice(){
    //     System.out.print("Make your selection: ");
    //     return In.nextChar();
    // }

    // private static void def_prompt(){
    //     System.out.println("Ples try again");
    // }
}