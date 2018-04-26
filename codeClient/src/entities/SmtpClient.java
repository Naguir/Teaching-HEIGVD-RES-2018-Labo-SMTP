package entities;

import ientitites.IMail;
import ientitites.IPersonne;
import ientitites.ISmtpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author Guillaume Zaretti
 */
public class SmtpClient implements ISmtpClient {

    private String ipAdress;
    private int port;

    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public SmtpClient(String ipAdress, int port) {
        this.ipAdress = ipAdress;
        this.port = port;

        
    }
    
    

    @Override
    public void sendEmail(IMail mail) {  
       

    }

    @Override
    public String getServerAdress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setServerAdress(String adresse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getServerPort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setServerPort(int port) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
