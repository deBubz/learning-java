package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Dog steeve = new Dog("Steve", 3, false);

        steeve.bark();
        steeve.eat();
        steeve.bark();
    }
}