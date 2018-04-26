/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconfiguration;
import ientitites.IMail;
import ientitites.IPersonne;
import ientitites.IServerConfig;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Guillaume Zaretti
 * @author Nair Alic
 */
public interface IConfigurationRepository {

       


    /**
     * retreave server config
     * @return configuration of server
     */
    IServerConfig retreaveServerFromConfigConfig();

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
