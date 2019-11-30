package app;

public class App {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) new GPACalc().use();           // manual use
        else
        switch(args[0]) {                               // with args
            case "-f":
            case "-fast":
                if(new ArgHandler(args).checkArgs()) {
                    new GPACalc().use(args);
                }
                else {
                    System.out.println("Invalid Fast Operation arguements, please use -h or --help for instructions");
                    System.exit(1);
                }
                break;
            case "-h":
            case "--help":
                new ArgHandler().help();
                break;
            default:
                System.out.println("Invalid arguements please use -h or --help for instructions");
                System.exit(1);
                break;
        }
    }
}