import java.text.SimpleDateFormat;
import java.util.*;
import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStreamReader;

/**
 * Run to check if is it NY yet
 */
public class IsItNy {
    public static void main(String[] args) {
        SimpleDateFormat fullDateFormatter = new SimpleDateFormat("yyyy 'at' HH:mm:ss");
        SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");
        Date date = new Date(System.currentTimeMillis());

        // URL url = new URL("worldtimeapi.org/api/ip");
        Url url = new URL("ddg.gg");
        // URLConnection uc = url.openConnection();
        // BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));

        // String input;
        // while ((input = in.readLine()) != null){
        //     System.out.println(inputLine);
        // }
        // in.close();

        System.out.println(url.toURI());

        // System.out.println();
        System.out.println(fullDateFormatter.format(date));
        System.out.println(yearFormatter.format(date));
    }
}

// ## Run `sudo apt-get install -y nodejs` to install Node.js 13.x and npm
// ## You may also need development tools to build native addons:
//      sudo apt-get install gcc g++ make
// ## To install the Yarn package manager, run:
//      curl -sL https://dl.yarnpkg.com/debian/pubkey.gpg | sudo apt-key add -
//      echo "deb https://dl.yarnpkg.com/debian/ stable main" | sudo tee /etc/apt/sources.list.d/yarn.list
//      sudo apt-get update && sudo apt-get install yarn
