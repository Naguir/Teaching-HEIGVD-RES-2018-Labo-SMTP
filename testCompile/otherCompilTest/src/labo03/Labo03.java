/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo03;

import client.SmtpClient;
import configuration.ConfigurationRepository;
import iclient.ISmtpClient;
import iconfiguration.IConfigurationRepository;
import ientitites.IMail;
import mailgenerator.PrankMailGenerator;
import imailgenerator.IPrankMailGenerator;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ZEED
 */
public class Labo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String filePath;
        filePath = "C:\\Users\\ZEED\\Documents\\RESBis\\labo3\\Teaching-HEIGVD-RES-2018-Labo-SMTP\\codeClient\\config\\config.properties";

        IConfigurationRepository cfgRepo = new ConfigurationRepository(filePath);
        IPrankMailGenerator pg = new PrankMailGenerator(cfgRepo);
        List<IMail> mails = pg.generateMailPranks();

        ISmtpClient smtpcli = new SmtpClient(cfgRepo.retreaveServerFromConfigConfig());

        for (IMail m : mails) {
            smtpcli.sendEmail(m);
        }
    }

}
