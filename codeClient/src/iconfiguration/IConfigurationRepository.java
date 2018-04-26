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
    String retreaveAdressFromConfig(String filePath) throws IOException;

    /**
     * retreave port number
     * @return port number
     */
    int retreavePortFromConfig();

    /**
     * retreave number of groups
     * @return number groupes
     */
    int retreaveNbGroupsFromConfig();

    /**
     * retreave victims list
     * @return list of victims
     */
    List<IPersonne> retreaveVictimsFromConfig();

    /**
     * retreave mails
     * @return list of mails
     */
    List<IMail> retreaveMailsFromConfig();

}
