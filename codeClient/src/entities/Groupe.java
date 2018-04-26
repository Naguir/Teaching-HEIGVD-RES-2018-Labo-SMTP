/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ientitites.IGoupe;
import ientitites.IPersonne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZEED
 */
public class Groupe implements IGoupe {

    List<IPersonne> groupeReciever;
    IPersonne sender;

    public Groupe() {
        groupeReciever = new ArrayList();
        sender = new Personne();
    }
    
    public Groupe(IPersonne sender){
        groupeReciever = new ArrayList();
        this.sender = sender;
    }
    

    @Override
    public List<IPersonne> getRecieverVictims() {
        return groupeReciever;
    }

    @Override
    public void setRecieverVictims(List<IPersonne> victims) {
       groupeReciever = victims;
    }

   

    @Override
    public void addVictim(IPersonne personne) {
        this.groupeReciever.add(personne);
    }

}
