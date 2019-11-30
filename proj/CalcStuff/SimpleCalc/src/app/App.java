package app;

import java.util.Scanner;

public class App {
    Calc calc;
    int a = 0,b = 0;
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.use();
        app.mainOptions();
    }

    public App() {
       calc = new Calc();
    }

    public void use(){
        System.out.println("Ohboy");
        a = Integer.parseInt(In.nextLine("Pick the first Number: "));
        b = Integer.parseInt(In.nextLine("Pick the seccond Number: "));
    }

    public void mainOptions() {
        char selector;
        while((selector = pickMainOption()) != 'x'){
            switch (selector) {
                case '1': add(); break;
                case '2': minus(); break;
                case '3': mult(); break;
                case '4': divis(); break;
                case '5': mod(); break;
                case 'c': changeNum(); break;
                default: System.out.println("Invalid option try again");                    break;
            }
        }
        System.out.println("\nxx Terminating xx\n");
    }

    public char pickMainOption() {
        System.out.println(
            "1. Add\n" +
            "2. Minus\n" +
            "3. Multiply\n" +
            "4. Divide\n" +
            "5. Modulo\n" +
            "c. Change numbers");
        return In.nextChar("Select an option: ");
    }

    public void changeNum() {
        char selector;
        while((selector = pickChangeNum()) != 'x'){
            switch(selector){
                case 'a': changeboth(); break;
                case 'b': changeA(); break;
                case 'c': changeB(); break;
                case 'r': mainOptions(); break;
                default: System.out.println("Try again"); break;
            }
        }
    }

    public char pickChangeNum(){
        System.out.println(
            "a. Change both num\n" +
            "b. Change first num: " + a + "\n" +
            "c. Change secc num: " + b + "\n" +
            "r. return to calculator\n" + 
            "x. close"
        );
        return In.nextChar("Ples pick an option");
    }

    public void add(){
        System.out.println("Result: " + calc.add(a, b) + "\n");
    }
    public void minus(){
        System.out.println("Result: " + calc.minus(a, b) + "\n");
    }   
    public void mult(){
        System.out.println("Result: " + calc.mult(a, b) + "\n");
    }   
    public void divis(){
        System.out.println("Result: " + calc.divis(a, b) + "\n");
    }   
    public void mod(){
        System.out.println("Result: " + calc.mod(a, b) + "\n");
    }

    public void changeboth(){
        a = In.nextInt("New a value ");
        b = In.nextInt("New b value ");
    }

    public void changeA() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
    }

    public void changeB() {
        b = In.nextInt("New b value ");
    }
}