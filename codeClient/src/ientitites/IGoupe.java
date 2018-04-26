/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ientitites;

import java.util.List;

/**
 *
 * @author Guillaume Zaretti
 * Groupe of victimes, contains the sender victime and all riciever victimes
 */
public interface IGoupe {
    
     List<IPersonne >getRecieverVictims();
     void setRecieverVictims(List<IPersonne> victims);
     
     IPersonne getSenderVictim();
     void setSenderVictim(IPersonne perosnne);
}
