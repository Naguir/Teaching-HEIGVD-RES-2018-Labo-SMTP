/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ientitites;

import entities.Groupe;
import java.util.List;

/**
 * @author Guillaume Zaretti E-mail interface
 */
public interface IMail {

    /**
     * get all recevers
     *
     * @return recevers
     */
    IGoupe getTo();

    /**
     * set all recevers
     *
     * @param to list of recievers
     */
    void setTo(IGoupe to);

    /**
     * get mail subject
     *
     * @return subject
     */
    String getSubject();

    /**
     * set mail subject
     *
     * @param subject
     */
    void setSubject(String subject);

    /**
     * get expeditor
     *
     * @return expeditor
     */
    IPersonne getFrom();

    /**
     * set expeditor
     *
     * @param from
     */
    void setFrom(IPersonne from);

    /**
     * get message
     *
     * @return massage
     */
    String getMessage();

    /**
     * set message
     *
     * @param message
     */
    void setMessage(String message);

}
