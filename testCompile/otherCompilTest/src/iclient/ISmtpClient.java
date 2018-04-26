package iclient;

import ientitites.*;
import java.net.Socket;

/**
 *
 * @author Guillaume Zaretti 
 * @author Nair Alic
 * Interface of smtp client you can send request to
 * the server smtp
 */
public interface ISmtpClient {

    /**
     * send email
     *
     * @param mail
     */
    void sendEmail(IMail mail);
}
