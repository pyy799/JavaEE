/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.XXQ.why;

import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author 昊阳
 **/
@ManagedBean
@Dependent
public class User {

    /**
     * Creates a new instance of User
     */
    private String uname;
    private String upassword;
    private String tmp_password1;
    private String tmp_password2;

    public String getTmp_password1() {
        return tmp_password1;
    }

    public void setTmp_password1(String tmp_password1) {
        this.tmp_password1 = tmp_password1;
    }

    public String getTmp_password2() {
        return tmp_password2;
    }

    public void setTmp_password2(String tmp_password2) {
        this.tmp_password2 = tmp_password2;
    }
    
    public User() {
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
    public boolean login(String uname,String upassword){
        return true;
    }
    public boolean signin(String uname, String upassword){
        return true;
    }

    
}
