import java.net.InetAddress;

public class _2 {
    public static void main(String[] args) {
    try{
        InetAddress ip=InetAddress.getByName("www.dei.ac.in");
        System.out.println("Host Name:"+ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());
    }
    catch(Exception e){
       
    }
}
}
