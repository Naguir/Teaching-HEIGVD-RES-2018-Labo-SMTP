/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import ientitites.IGoupe;
import ientitites.IMail;
import ientitites.IPersonne;
import java.util.List;

/**
 *
 * @author ZEED
 */
public class Mail implements IMail {

    private IPersonne sender;
    private IGoupe listVictims;
    private String subject;
    private String message;

    @Override
    public IGoupe getTo() {
        return listVictims;
    }

    @Override
    public void setTo(IGoupe to) {
        this.listVictims = to;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public IPersonne getFrom() {
        return sender;
    }

    @Override
    public void setFrom(IPersonne from) {
        sender = from;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

}
