package app;

/**
 * Insect
 */
public class Insect {
    int legs;
    int age;

    public Insect(int age, int legs) {
        this.legs = legs;
        this.age = age;
    }

    public void say(){
        System.out.println("...");
    }
    
    public void crawl(){
        System.out.println("im on your face");  
    }
    
}