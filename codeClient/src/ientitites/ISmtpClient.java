package ientitites;

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
    void sendEmail(IMail mail, );
    String getServerAdress();
    void setServerAdress(String adresse);
    int getServerPort();
    void setServerPort(int port);
   
    
    
    
    
}
