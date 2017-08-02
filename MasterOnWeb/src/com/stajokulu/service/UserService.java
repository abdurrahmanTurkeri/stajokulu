package com.stajokulu.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stajokulu.pojo.User;

public class UserService {

    private List<User>  userList;
    
    public List<User> kullaniciListesiAl() throws ClassNotFoundException, SQLException {
        List<User> userList=new ArrayList<User>();
        String sqlText = "select *  from user";
        Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sys","root","123456");
		PreparedStatement  stmt = conn.prepareStatement(sqlText);
        ResultSet rs = stmt.executeQuery();
        User user=null;
        while (rs.next()) {   
            user=new User();
            String firstName = rs.getString(1);
            String lastName = rs.getString("last_name");
            int id=rs.getInt("iduser");
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setId(id);
            userList.add(user);
        }
       
        return userList;
    }

    public List<User> getUserList() throws ClassNotFoundException, SQLException {
        userList=kullaniciListesiAl();
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
    

}
