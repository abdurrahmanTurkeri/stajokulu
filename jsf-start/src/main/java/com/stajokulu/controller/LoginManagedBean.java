/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.controller;

import com.stajokulu.entity.UserTable;
import com.stajokulu.service.UserService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author Dg Teknik Arşiv
 */
@ManagedBean
@ViewScoped
public class LoginManagedBean implements Serializable{
    
    @Inject
    UserService userService;
    
    private UserTable userTable;
    private List<UserTable> userList=new ArrayList<>();
    
    public LoginManagedBean(){
        
    }
    
    @PostConstruct
    public void eskiConstructorLarBirIseYaramaz(){
       userTable= new UserTable();
        userList=userService.getUserList();
                
                }
    
    public void saveUser(){
        userService.insertUser(userTable);
        userList=userService.getUserList();
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }

    public List<UserTable> getUserList() {
        return userList;
    }

    public void setUserList(List<UserTable> userList) {
        this.userList = userList;
    }
    
    
    
    
    
    
}
