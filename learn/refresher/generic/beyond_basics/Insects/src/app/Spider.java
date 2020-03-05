package app;

/**
 * Spider
 */
public class Spider extends Insect {
    boolean isVenomous;

    public Spider(int age, boolean isVenomous){
        super(age, 8);
        this.isVenomous = isVenomous;
    }

    @Override
    public void say(){
        System.out.println("Hiss");
    }
    
}