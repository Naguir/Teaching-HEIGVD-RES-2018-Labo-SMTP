/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ientitites.IPersonne;

/**
 *
 * @author ZEED
 */
public class Personne implements IPersonne {

    private String adresse;

    public Personne(){}
    
    public Personne(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String getAdresse() {
        return adresse;
    }

    @Override
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
