/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.SlaveModbus;

import de.re.easymodbus.server.ModbusServer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author dugen
 */
public class SlaveFunc {
    
    public static void serverSetup(ModbusServer server, String stringPort) throws Exception {
        int port = 0;
     
        if (stringPort.matches("\\d+")) {
            port = Integer.parseInt(stringPort);
        } else {
            throw new Exception("Invalid port");
        }         
        server.setPort(port);     
        server.setClientConnectionTimeout(25000);
    }
    
    public static void startSlave(ModbusServer server) throws Exception{
        try {
            server.Listen();
        } catch (IOException e) {
            throw new Exception("Error");
        } 
    }
    
    public static void stopServer(ModbusServer server) throws ThreadDeath{
        server.StopListening();
    }
    
    public static void setunsetCoil(ModbusServer server, int coil, boolean Status) {
        server.coils[coil] = Status;
    }   
    
    public static List<String> GetLocalIP() throws Exception {
        List<String> ipList = new ArrayList<>();
     
        Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
        while (n.hasMoreElements()) {
            NetworkInterface e = n.nextElement();
            Enumeration<InetAddress> a = e.getInetAddresses();
            while (a.hasMoreElements()) {
                String ip = ((InetAddress)a.nextElement()).getHostAddress();
                if (ip.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}")) {
                    ipList.add(ip);
                }
            } 
        } 
     return ipList;
    }
}
