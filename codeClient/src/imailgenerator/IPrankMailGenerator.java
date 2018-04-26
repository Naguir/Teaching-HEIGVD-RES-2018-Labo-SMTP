/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imailgenerator;

import ientitites.IGoupe;
import ientitites.IMail;
import java.util.List;

/**
 *
 * @author ZEED
 */
public interface IPrankMailGenerator {

    
    /**
     * Generate a list of email pranks
     * @return 
     */
    List<IMail> generateMailPranks();
    
}
