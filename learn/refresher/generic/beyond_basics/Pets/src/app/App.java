package app;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // Dog d = new Dog();
        // Cat c = new Cat();

        // if (c instanceof Pet){
        //     c.play();
        // }
        // if (d instanceof Pet){
        //     d.play();
        // }

        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if (n == 0){
            p = new Dog();
        }
        else {
            p = new Cat();
        }

        p.play();
    }
}