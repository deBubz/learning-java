
/**
 * Lambda
 */
public class Lambda {

    public static void main(String[] args) {
        // this maps to the function answer() with the String return types
        // connects correctly as the anonymous func has 0 args and a string return type
        Answerable phone = () -> { return "Hello"; };
        System.out.println(phone.answer());

        Predicate isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(3));
    }
}

public interface Answerable {
    String answer();
}

public interface Predicate {
    boolean test(int n);
}