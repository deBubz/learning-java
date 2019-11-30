package app;

/**
 * Animal
 */
public class Animal {

    private String name;
    private int legs;

    public Animal(String name, int legs){
        this.legs = legs;
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " has " + legs + " legs";
    }
    
}