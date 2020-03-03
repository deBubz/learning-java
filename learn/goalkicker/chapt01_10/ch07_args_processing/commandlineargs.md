# Command line Arguement Processing

`args` the command line arg. Assuming the `main` method is invoked by the java launcher, `args` wil be non null

## Argument processing using GWT Toolbasw

to parse more complex cmd-line args (with optional params) best to use [google GWT] approach

## Processing arguements by hand

its reasonable to do the command arguement processing entirely in custom code.

These are some examples. In each case, code will produce error if arguements are unacceptabble, then call `System.exit(1)` to tell the shell the command failed (we assume in each case that the java code is invoked using a wrapper whose name is *myapp*)

### Command with no args

```java
public class Main {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.err.println("usage: myapp");
            System.exit(1);
        }

        // else ok run
        // ...
    }
}
```

### Command with 2 args

```java
public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("usage: myapp");
            System.exit(1);
        }

        // else ok run
        // ...
        System.out.println("Worked with: " + args[0] + " and " + args[1]);
    }
}
```

### Command with "flag" and atleast 1 arg

```java
package tommy;
public class Main {
    public static void main(String[] args) {
        boolean feel = false;
        boolean see = false;
        int index;

        loop: for (index = 0; index < args.length; index++) {
            String opt = args[index];
            switch (opt) {
                case "-c": see = true; break;
                case "-f": feel = true; break;
                default:
                    if(!opt.isEmpty() && opt.charAt(0) == '-') {
                        error("Unknown option: '" + opt "'");
                    }
                break loop;
            }
        }
        if (index >= args.length) {
            error("Missing args");
        }

        // Run
    }

    private static void error(String message) {
        // error message
        if (message != null) {
            System.err.println(message);
        }
        System.err.println("usage: myapp [-f] [-c] [ <arg> ... ]");
        System.exit(1);
    }
}
```

