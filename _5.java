import java.net.InetAddress;
import java.net.UnknownHostException;

public class _5 {
    public static void main(String[] args) {
        String ipAddress = "8.8.8.8";
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            String hostname = inetAddress.getHostName();
            
            System.out.println("Hostname for IP address " + ipAddress + ": " + hostname);
        } catch(Exception e){System.out.println(e);}
    }
}
