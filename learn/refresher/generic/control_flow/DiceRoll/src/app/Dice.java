package app;

import java.util.Random;

/**
 * Dice
 */
public class Dice {

    int faceup;
    Random rand;

    public Dice(int faceup){
        if (faceup > 6 && faceup < 1) {
            System.out.println("Not possible");
            System.exit(1);
        } else {
            this.faceup = faceup;
            this.rand = new Random();
        }
    }
    public void flip(){
        faceup = this.rand.nextInt(6) + 1;
    }

    public int getFace() { return this.faceup; }
}