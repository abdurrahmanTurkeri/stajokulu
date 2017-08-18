/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.service;

import com.stajokulu.entity.UserTable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Dg Teknik Arşiv
 */
@Stateless
public class UserServiceImpl implements UserService {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<UserTable> getUserList() {
        Query query=em.createQuery("select a from USER_TABLE as a");
        return query.getResultList();
    }

    @Override
    public boolean insertUser(UserTable userTable) {
        try {
            em.persist(userTable);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public UserTable findUserById(long id) {
        UserTable user = (UserTable) em.find(UserTable.class, id);
        return user;
    }

    @Override
    public UserTable updateUser(UserTable userTable) {
        UserTable returnedUser = em.merge(userTable);
        return returnedUser;
    }

    @Override
    public boolean removeUser(long id) {
        try {
            em.remove(id);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
