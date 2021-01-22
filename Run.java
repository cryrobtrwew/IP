import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Run implements Runnable {

    @Override
    public void run() {
        // just an example of how to display
        JOptionPane.showMessageDialog(null, ipLog());
    }

    public static String ipLog(){
        String IP;
        try {
            // goes to the url and reads the first line which has your ip
            URL urlName = new URL("http://bot.whatismyipaddress.com");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlName.openStream()));
            IP = bufferedReader.readLine().trim();
        }catch (Exception e) {
            IP = "Cannot Execute Correctly";
        }
        return IP;
    }

    // now you could use this in Minecraft to log unwanted people from using your client but I will not give you the code to log the ip in a server
    // or a anything else.

}
