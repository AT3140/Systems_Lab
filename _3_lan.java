// Write a program to find the address of the local machine.

import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class _3_lan {
    public static void main(String[] args) {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            String localIpAddress = localhost.getHostAddress();
            
            System.out.println("Local machine's IP address: " + localIpAddress);
        } catch (Exception e) {
           
        }
    }
}

