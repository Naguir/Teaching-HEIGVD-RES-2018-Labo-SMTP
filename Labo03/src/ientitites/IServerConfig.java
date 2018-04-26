/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ientitites;

/**
 *
 * @author ZEED
 */
public interface IServerConfig {

    /**
     * get port
     *
     * @return num port
     */
    int getPort();

    /**
     * set port
     *
     * @param port
     */
    void setPort(int port);

    /**
     * get Adresse
     *
     * @return adresse
     */
    String getAddresse();

    /**
     * set adresse
     *
     * @param addresse
     */
    void setAdresse(String addresse);
}
