package client;

import iclient.ISmtpClient;
import ientitites.IMail;
import ientitites.IPersonne;
import ientitites.IServerConfig;
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

    private IServerConfig serverConfig;
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public SmtpClient(IServerConfig serverConfig) {
        this.serverConfig = serverConfig;
    }

    public void sendEmail(IMail mail) {
        try {
            socket = new Socket(serverConfig.getAddresse(), serverConfig.getPort());
            writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = reader.readLine();
            writer.println("EHLO pranker");
            writer.flush();
            line = reader.readLine();

            if (line.startsWith("250")) {
                while (!line.startsWith("250")) {
                    line = reader.readLine();
                }

            } else {
                throw new IOException("erreur");
            }

            writer.println("MAIL FROM: " + mail.getFrom());
            writer.flush();
            line = reader.readLine();
            for (IPersonne p : mail.getTo().getRecieverVictims()) {
                writer.println("RCPT TO: " + p.getAdresse());
                writer.flush();
                line = reader.readLine();
            }
            writer.println("DATA");
            writer.flush();
            line = reader.readLine();
            writer.println("From: " + mail.getFrom());
            writer.print("To: ");
            for (int i = 0; i < mail.getTo().getRecieverVictims().size(); i++) {
                if (i > 0) {
                    writer.print(", ");
                }
                writer.print(mail.getTo().getRecieverVictims().get(i));
            }

            writer.print("\r\n");
            writer.println(mail.getSubject());
            writer.println(mail.getMessage());
            writer.println(".");
            writer.flush();

            line = reader.readLine();

            writer.println("QUIT");
            writer.flush();
            reader.close();
            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
