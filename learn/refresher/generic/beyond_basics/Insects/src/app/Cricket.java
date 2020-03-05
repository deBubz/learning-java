package app;

/**
 * Cricket
 */
public class Cricket extends Insect {
    int length;

    public Cricket(int age, int length){
        super(age, 6);
        this.legs = length;
    }

    @Override
    public void say(){
        System.out.println("chirp");
    }

    public void jump(){
        System.out.println("I Jumped");
    }
    
}