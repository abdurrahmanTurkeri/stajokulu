/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.service;

import com.stajokulu.entity.UserTable;
import java.util.List;
import javax.ejb.Local;

@Local
public interface UserService {
    
    public List<UserTable> getUserList();
    
    public boolean  insertUser(UserTable userTable);
    
    public UserTable findUserById(long id);
    
    public UserTable updateUser(UserTable userTable);
    
    public boolean  removeUser(long id);
    
}
