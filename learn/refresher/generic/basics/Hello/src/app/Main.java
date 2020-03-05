package app;
import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Car myCar = new Car(25, "wasd", Color.BLUE, false);
        Car your = new Car(30, "eeee", Color.BLACK, true);

        System.out.println("My cars plate: " + myCar.plate);
        System.out.println("Your plate " + your.plate);

        myCar.changeColor(Color.RED);
    }
}