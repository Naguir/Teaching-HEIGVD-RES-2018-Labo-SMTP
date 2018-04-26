package iclient;

import ientitites.*;
import java.net.Socket;

/**
 *
 * @author Guillaume Zaretti
 * Interface of smtp client
 * you can send request to the server smtp
 */
public interface ISmtpClient {
    /**
     * send email
     * @param mail 
     */
    void sendEmail(IMail mail);
    /**
     * get server adress ip
     * @return adresse ip from server
     */
    String getServerAdress();
    /**
     * set server adresse
     * @param adresse ip
     */
    void setServerAdress(String adresse);
    /**
     * get server port
     * @return prot number
     */
    int getServerPort();
    /**
     * set server port
     * @param port number
     */
    void setServerPort(int port);
   
    
    
    
    
}
