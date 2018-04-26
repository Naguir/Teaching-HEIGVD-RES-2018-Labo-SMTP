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
 * @author Nair Alic
 * Groupe of victimes, contains the sender victime and all riciever victimes
 */
public interface IGoupe {
    
    /**
     * get groups of reciever vivtims
     * @return reciever
     */
     List<IPersonne >getRecieverVictims();
     
     /**
      * set grous of reciever victims
      * @param victims 
      */
     void setRecieverVictims(List<IPersonne> victims);

     /**
      * add victim into the group
      * @param personne 
      */
     void addVictim(IPersonne personne);
}
