/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stajokulu.rest;

import com.stajokulu.entity.UserTable;
import com.stajokulu.service.UserService;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/user")
@RequestScoped
public class UserRestService {

    @Inject
    UserService userService;

    /**
     * Creates a new instance of FetvaRsController
     */
    public UserRestService() {
    }

    @GET
    @Path("/userList")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<UserTable> getUserList() {
        try {
            List<UserTable> result = null;
            result = userService.getUserList();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    @GET
    @Path("user/detail/{id}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public UserTable getUser(@PathParam("id")String id){
        UserTable userTable=userService.findUserById(Integer.parseInt(id));
        return userTable;
    }

}
