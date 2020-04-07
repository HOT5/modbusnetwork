/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.MasterModbas;

import de.re.easymodbus.modbusclient.*;
import java.io.IOException;

/**
 *
 * @author dugen
 */
public class MasterFunc {
    
    public static void setup(ModbusClient client, String ip, String stringPort) throws Exception {
        int port = 0;
     
        if (ip.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}")) {
            client.setipAddress(ip);
        } else {
            throw new Exception("Invalid IP");
        } 
        if (stringPort.matches("\\d+")) {
            port = Integer.parseInt(stringPort);
            client.setPort(port);
        } else {
            throw new Exception("Invalid port");
        }  
    }
    
    public static void connect(ModbusClient client) throws Exception {
        try {
            client.Connect();
        } catch (IOException e) {
            System.out.println(e);
            throw new Exception("Host is not found");
        }   
    }
    
    public static void disconnect(ModbusClient client) throws Exception {
        try {
            client.Disconnect();
        } catch (IOException e) {
            throw new Exception("Error");
        } 
    }
    
    public static void setunsetCoil(ModbusClient client, int coil, boolean status) {
        try {
            client.WriteSingleCoil(coil, status);
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
