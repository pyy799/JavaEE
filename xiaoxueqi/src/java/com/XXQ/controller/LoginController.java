/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.XXQ.controller;

import com.XXQ.query.DataQuery;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author 昊阳
 */
@ManagedBean(name = "login")
@SessionScoped
public class LoginController implements Serializable {

    private String username;
    private String password;
    private final DataQuery query = new DataQuery();
    
    public String loginControl() {
        if(query.loginControl(username, password)){
            return "login.xhtml?faces-redirect = ture";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "username or Password incalid!!"));
        
        return "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
