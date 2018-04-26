/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconfiguration;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import ientitites.IMail;
import ientitites.IPersonne;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ZEED
 */
public interface IConfigurationRepository {

       
    /**
     * retreave smtp server adress
     * @return adresse
     */
    String retreaveAdress(String filePath) throws IOException;

    /**
     * retreave port number
     * @return port number
     */
    int retreavePort();

    /**
     * retreave number of groups
     * @return number groupes
     */
    int retreaveNbGroups();

    /**
     * retreave victims list
     * @return list of victims
     */
    List<IPersonne> retreaveVictims();

    /**
     * retreave mails
     * @return list of mails
     */
    List<IMail> retreaveMails();

}
