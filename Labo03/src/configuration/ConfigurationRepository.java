/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import entities.Mail;
import entities.Personne;
import entities.ServerConfig;
import iconfiguration.IConfigurationRepository;
import ientitites.IMail;
import ientitites.IPersonne;
import ientitites.IServerConfig;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author ZEED
 */
public class ConfigurationRepository implements IConfigurationRepository {

    private int nbgroups;
    private IServerConfig serverConfig;
    private List<IPersonne> victims;
    private List<IMail> messages;

    public ConfigurationRepository(String filePath) throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fin);
        serverConfig = new ServerConfig();

        serverConfig.setAdresse(properties.getProperty("smtpServerAdress"));
        serverConfig.setPort(Integer.parseInt(properties.getProperty("smtpServerPort")));
        nbgroups = Integer.parseInt(properties.getProperty("numberOfGroups"));
        victims = RetreaveVictimsFromFile(properties.getProperty("victimListeFile"));
        messages = RetreaveMessagesFromFile(properties.getProperty("messagesListeFile"));
        System.out.println("Message list OK");
    }

    @Override
    public IServerConfig retreaveServerFromConfigConfig() {
        return serverConfig;
    }

    @Override
    public int retreaveNbGroupsFromConfig() {
        return nbgroups;
    }

    @Override
    public List<IPersonne> retreaveVictimsFromConfig() {
        return victims;
    }

    @Override
    public List<IMail> retreaveMailsFromConfig() {
        return messages;
    }

    private List<IMail> RetreaveMessagesFromFile(String filePath) throws IOException {
        List<IMail> listMail;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

            listMail = new ArrayList();
            String line = null;
            while ((line = reader.readLine()) != null) {
                IMail mail = new Mail();
                while ((line = reader.readLine()) != null && !line.equals("##")) {
                    if (line.startsWith("Subject: ")) {
                        mail.setSubject(line.substring(9));
                    }
                    mail.setMessage(mail.getMessage() + line + "\r\n");
                }
                listMail.add(mail);
            }
            return listMail;

        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    private List<IPersonne> RetreaveVictimsFromFile(String fileName) throws IOException {
        List<IPersonne> victims;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            victims = new ArrayList();
            String line;
            while ((line = reader.readLine()) != null) {
                victims.add(new Personne(line));
            }
            return victims;
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}
