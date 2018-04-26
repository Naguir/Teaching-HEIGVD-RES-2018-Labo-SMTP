/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ientitites.IServerConfig;

/**
 *
 * @author ZEED
 */
public class ServerConfig implements IServerConfig{

    private int port;
    private String addresse;
    @Override
    public int getPort() {
        return port;
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String getAddresse() {
        return addresse;
    }

    @Override
    public void setAdresse(String addresse) {
       this.addresse = addresse;
    }
    
}
