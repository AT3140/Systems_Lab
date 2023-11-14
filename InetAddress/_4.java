// Write a program to find all the IP addresses mapped to a domain name.

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _4 {
    public static void main(String[] args) {
        String domainName = "www.dei.ac.in";

        try {
            InetAddress[] addresses = InetAddress.getAllByName(domainName);
            
            System.out.println("IP addresses associated with " + domainName + ":");
            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (Exception e) {
           
        }
    }
}
