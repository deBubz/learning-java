package app;

/**
 * Menu
 * handling menu options
 */

public class Menu {
    Calc calc;
    public Menu(){
        System.out.println("Letsa go");
        calc = new Calc(
            Integer.parseInt(In.nextLine("First Num")),
            Integer.parseInt(In.nextLine("First Num"))
        );
        System.out.println();
    }

    // Menu Options
    public void use(){
        char select;
        while((select = selectMain()) != 'x'){
            switch(select){
                case '1': System.out.println("Add: " + calc.add());
                case 'c': changeMenu(); break;
                default: System.out.println("INVALID - tryagain");
            }
        }    
    }
    
    public char selectMain() {
        System.out.println(
            "1. Add\n" +
            "c. Change Num\n"
        );
        return In.nextChar("What you picking: ");
    }

    // Change Options;
    public void changeMenu(){
        char select;
        while ((select = selectChange()) != 'b'){
            if(select == '1'){
                calc.setA(Integer.parseInt(In.nextLine("Change to ")));
            }
        }     
    }   

    public char selectChange(){
        System.out.println(
            "1. Change first\n" +
            "2. Change Seccond\n"
        );
        return In.nextChar("What you picking");
    }
}

// select main options
//  add, change num ,exit
