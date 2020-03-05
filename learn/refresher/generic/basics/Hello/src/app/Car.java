package app;
import java.awt.Color;
/**
 * Car
 * Practice OOP
 */

public class Car {
    // attributes
    int avgMPG;
    String plate;
    Color paint;
    boolean workingTailLight;
    
    // constructor
    public Car( int inAvg, String inPlate, Color inColor, boolean inTail){
        this.avgMPG = inAvg;
        this.plate = inPlate;
        this.paint = inColor;
        this.workingTailLight = inTail;
    }

    // methods
    public void changeColor (Color newColor){
        this.paint = newColor;
    }
}