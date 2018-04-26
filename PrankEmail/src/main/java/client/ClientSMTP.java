/**
 * 
 * 
 * @author Nair Alic
 * @author Guillaume Zaretti
 */
package client;

import java.io.*;
import java.net.Socket;

public class ClientSMTP implements IClientSMTP {
   
   private Socket clientSocket = null;
   private PrintWriter writer = null;
   private BufferedReader reader = null;
   
   int port;
   String server;
   String line;
   
   public ClientSMTP (String server, int port) {
      this.server = server;
      this.port = port;
   }
   
   
   
   
}
