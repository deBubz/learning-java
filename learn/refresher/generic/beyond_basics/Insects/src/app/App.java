package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Insect ins  = new Insect(4, 4);
        Spider spider = new Spider(12, true);
        Cricket grass = new Cricket(1, 11);

        ins.crawl();
        ins.say();

        spider.crawl();
        spider.say();

        grass.crawl();
        grass.say();
        grass.jump();
    }
}