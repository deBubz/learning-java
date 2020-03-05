package app;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Roll Dice");
        
        Dice dice =  new Dice(1);
        System.out.println("INIT " + dice.getFace());

        for (int i = 0; i < 10; i++){
            dice.flip();
            System.out.println("RESULT: " + dice.getFace());
        }
    }
}