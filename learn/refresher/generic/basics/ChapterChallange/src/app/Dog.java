package app;

/**
 * Dog
 * 
 */

public class Dog {
    String name;
    int age;
    boolean hunger;

    public Dog(String name, int age ,boolean hunger) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
    }

    public void bark(){
        System.out.println("bark");
    }

    public void eat(){
        if (hunger) hunger = !hunger;
        else System.out.println("Its not hungry");
    }

    public void age(){
        this.age ++;
    }
}