package app;

/**
 * Calc class, handling number stuff
 */
public class Calc {
    private int a = 0, b = 0;

    public Calc(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() { return a;}
    public int getB() { return b;}

    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }
    
    public int add(){
        return this.a + this.b;
    }
}