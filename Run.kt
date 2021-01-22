import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import javax.swing.JOptionPane

class Run : Runnable {
        
    // Kotlin Version
    // Disclaimer I suck at Kotlin so if my Kotlin version looks like dogshit or has problems then I am very sorry I suck at Kotilin
        
    override fun run() {
        // just an example of how to display
        JOptionPane.showMessageDialog(null, ipLog())
    }

    companion object {
        fun ipLog(): String {
            val IP: String
            IP = try {
                // goes to the url and reads the first line which has your ip
                val urlName = URL("http://bot.whatismyipaddress.com")
                val bufferedReader = BufferedReader(InputStreamReader(urlName.openStream()))
                bufferedReader.readLine().trim { it <= ' ' }
            } catch (e: Exception) {
                "Cannot Execute Correctly"
            }
            return IP
        }
        // now you could use this in Minecraft to log unwanted people from using your client but I will not give you the code to log the ip in a server
        // or a anything else.
    }
}
